package web.controller;

import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userDao.getAll());
        return "users/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        return "users/form";
    }

    @PostMapping("/save")
    public String saveUser(@RequestParam(required = false) Long id,
                           @RequestParam String name,
                           @RequestParam String email,
                           @RequestParam Integer age) {
        User user = new User();
        if (id != null) {
            user.setId(id);
        }
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);

        if (id == null) {
            userDao.save(user);
        } else {
            userDao.update(user);
        }
        return "redirect:/users";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam Long id, Model model) {
        model.addAttribute("user", userDao.getById(id));
        return "users/form";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userDao.delete(id);
        return "redirect:/users";
    }
}