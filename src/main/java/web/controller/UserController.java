package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }


    // Метод для отображения формы
    @GetMapping("/addUserForm")
    public String showAddUserForm() {
        return "addUser";  // Имя HTML страницы (addUserForm.html)
    }


    @PostMapping("/add")
    public String add(
            @RequestParam("name") String name,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            Model model) {

        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setEmail(email);

        userService.addUser(user);

        System.out.println(user);

        model.addAttribute("message", "Пользователь успешно добавлен!");
        return "success";
    }


    @GetMapping("/testAdd")
    @ResponseBody
    public String testAdd() {
        User user = new User();
        user.setName("Test");
        user.setLastName("User");
        user.setEmail("test@example.com");
        userService.addUser(user);
        return "OK";
    }


}
