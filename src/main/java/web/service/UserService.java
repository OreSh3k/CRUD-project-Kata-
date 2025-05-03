package web.service;


import web.dao.UserDao;
import web.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUserById(User user, int id);

    public User findUser(int id);

    public List<User> getAllUsers();
}
