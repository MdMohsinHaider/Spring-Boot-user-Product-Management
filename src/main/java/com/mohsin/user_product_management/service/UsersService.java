package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.entities.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    User saveUser(User user);

    List<User> saveUsers(List<User> users);

    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    Optional<User> updateUserById(int id, User user);

    boolean deleteUserById(int id);
}
