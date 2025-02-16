package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * Interface for User Management Service.
 * Defines CRUD operations for managing users.
 *
 * @author Md Mohsin
 * @version 1.0
 */
public interface UsersService {

    /**
     * Saves a new user in the database.
     *
     * @param user The user to be saved.
     * @return The saved user with a generated ID.
     */
    User saveUser(User user);

    /**
     * Saves multiple users in batch mode.
     *
     * @param users The list of users to be saved.
     * @return The list of saved users.
     */
    List<User> saveUsers(List<User> users);

    /**
     * Retrieves all users from the database.
     *
     * @return A list of all users.
     */
    List<User> getAllUsers();

    /**
     * Fetches a user by their unique ID.
     *
     * @param id The ID of the user.
     * @return An Optional containing the user if found, otherwise empty.
     */
    Optional<User> getUserById(int id);

    /**
     * Updates a user by their ID with new details.
     *
     * @param id The ID of the user to update.
     * @param user The updated user details.
     * @return An Optional containing the updated user if the update is successful.
     */
    Optional<User> updateUserById(int id, User user);

    /**
     * Deletes a user by their ID.
     *
     * @param id The ID of the user to delete.
     * @return true if the deletion was successful, false otherwise.
     */
    boolean deleteUserById(int id);
}
