package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * UsersDao interface provides an abstraction for User-related database operations.
 */
public interface UsersDao {

    /**
     * Saves a user entity to the database.
     *
     * @param user the user entity to be saved
     * @return the saved user entity
     */
    User saveUserDao(User user);

    /**
     * Saves a List<User> entity to the database.
     *
     * @param users the user entity to be saved
     * @return the saved user entity
     */
    List<User> saveUsersDao(List<User> users);

    /**
     * Retrieves all users from the database.
     *
     * @return a list of all users
     */
    List<User> getAllUsers();

    /**
     * Retrieves a user by their ID.
     *
     * @param id the ID of the user
     * @return an optional containing the user if found, otherwise empty
     */
    Optional<User> getUserById(int id);

    /**
     * Updates a user by their ID.
     *
     * @param id the ID of the user to be updated
     * @param user the updated user entity
     * @return the updated user entity if successful
     */
    Optional<User> updateUserById(int id, User user);

    /**
     * Deletes a user by their ID.
     *
     * @param id the ID of the user to be deleted
     * @return true if the user was deleted, false otherwise
     */
    boolean deleteUserById(int id);
}
