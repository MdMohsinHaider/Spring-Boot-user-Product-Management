package com.mohsin.user_product_management.controller;

import com.mohsin.user_product_management.service.UsersService;
import com.mohsin.user_product_management.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(value = "http://localhost:5173")
public class UserController {

    @Autowired
    private UsersService usersService;

    @PostMapping(value = "/saveUser")
    public User saveUserController(@RequestBody User user){
        return usersService.saveUser(user);
    }

    @PostMapping(value = "/saveMultipleUser")
    public List<User> saveMultipleUsersController(@RequestBody List<User> users) {
        return usersService.saveUsers(users);
    }

    @GetMapping("/allUser")
    public List<User> getAllUsersController() {
        return usersService.getAllUsers();
    }

    @GetMapping(value = "/getUserById/{id}")
    public Optional<User> getUserByIdController(@PathVariable(name = "id") int id) {
        return usersService.getUserById(id);
    }

    @PutMapping(value = "/updateUserById/{id}")
    public Optional<User> updateUserByIdController(@PathVariable(name = "id") int id, @RequestBody User user){
        return usersService.updateUserById(id, user);
    }

    @DeleteMapping(value = "/deleteUserById/{id}")
    public boolean deleteUserById(@PathVariable(name = "id") int id) {
        return usersService.deleteUserById(id);
    }
}
