package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUserById (int id);

    public Optional<User> findUser(int id);

    public List<User> findUserByNameAndEmail(String email, String name);

    public List<User> getAllUsers();
}
