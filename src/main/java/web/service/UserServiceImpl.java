package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUserById(User user, int id) {
        userDao.deleteUserById(user, id);
    }

    @Override
    public User findUser(int id) {
       return userDao.findUser(id);
    }

    @Override
    public List<User> getAllUsers() {
    return userDao.getAllUsers();
    }
}
