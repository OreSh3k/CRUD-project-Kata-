package web.dao;

import web.model.User;

public interface UserDao {

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public User findUser(String id);
}
