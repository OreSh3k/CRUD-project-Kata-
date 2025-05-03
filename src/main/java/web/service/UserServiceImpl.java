package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUserById(User user, int id) {
        userDao.deleteUserById(user, id);
    }
    @Transactional
    @Override
    public User findUser(int id) {
       return userDao.findUser(id);
    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
    return userDao.getAllUsers();
    }
}
