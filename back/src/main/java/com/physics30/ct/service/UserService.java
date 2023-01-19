package com.physics30.ct.service;

import com.physics30.ct.domain.User;
import com.physics30.ct.form.UserCredentialsRegister;
import com.physics30.ct.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByLoginAndPassword(String login, String password) {
        return login == null || password == null ? null : userRepository.findByLoginAndPassword(login, password);
    }

    public User findById(Long id) {
        return id == null ? null : userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return userRepository.findAllByOrderByIdDesc();
    }

    public User register(UserCredentialsRegister userCredentials) {
        User user = new User();
        user.setAdmin(false);
        user.setLogin(userCredentials.getLogin());
        user.setName(userCredentials.getName());
        userRepository.save(user);
        userRepository.updatePasswordSha(user.getId(), userCredentials.getLogin(), userCredentials.getPassword());
        return user;
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
}
