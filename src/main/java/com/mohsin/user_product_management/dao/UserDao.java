package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.User;
import com.mohsin.user_product_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDao implements UsersDao{

    @Autowired
    private UserRepository userRepository;

    // save user
    @Override
    public User saveUserDao(User user){
        return userRepository.save(user);
    }

    // save users
    @Override
    public List<User> saveUsersDao(List<User> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> updateUserById(int id, User user) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Updating fields with new values from the request body
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setDob(user.getDob());
            existingUser.setPhone(user.getPhone());
            existingUser.setPassword(user.getPassword());

            // Save the updated user to the database
            userRepository.save(existingUser);

            return Optional.of(existingUser);
        }
        return Optional.empty();
    }


    @Override
    public boolean deleteUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
