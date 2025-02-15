package com.mohsin.user_product_management.validation;

import com.mohsin.user_product_management.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {

    public void validateUser(User user) {
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            throw new IllegalArgumentException("Username is required");
        }
        if (user.getEmail() == null || !user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (user.getPassword() == null || user.getPassword().length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
        if (user.getPhone() == null || !user.getPhone().matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be 10 digits");
        }
    }
}
