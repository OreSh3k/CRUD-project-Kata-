package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUserById(User user, int id);

    public List<User> getAllUsers();

    public User findUser(int id);
}
