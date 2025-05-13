package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
    @Transactional()
    public void updateUser(User user) {
        userRepository.save(user);
    }
    @Transactional
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
    @Transactional
    @Override
    public User findUser(int id) {
       return userRepository.findById(id).orElse(null);
    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
    return userRepository.findAll();
    }
}

