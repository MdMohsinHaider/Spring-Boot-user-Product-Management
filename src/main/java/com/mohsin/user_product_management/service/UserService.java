package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.dao.UsersDao;
import com.mohsin.user_product_management.entities.User;
import com.mohsin.user_product_management.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UsersService {

    @Autowired
    private UsersDao userDao;

    @Autowired
    private UserValidator userValidator;

    @Override
    public User saveUser(User user) {
        userValidator.validateUser(user);
        return userDao.saveUserDao(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        for (User user : users) {
            userValidator.validateUser(user);
        }
        return userDao.saveUsersDao(users);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public Optional<User> updateUserById(int id, User user) {
        userValidator.validateUser(user);
        return userDao.updateUserById(id, user);
    }

    @Override
    public boolean deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}
