package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.User;

import java.util.List;
import java.util.Optional;

/**
 * The {@code UsersDao} interface provides methods for performing CRUD operations on User entities.
 * It defines methods to save, retrieve, update, and delete user records.
 *
 * @author Md Mohsin Haider
 * @version 1.0
 * @since 2025
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
     * Saves multiple users to the database in bulk.
     *
     * @param users the list of user entities to be saved
     * @return the list of saved user entities
     */
    List<User> saveUsersDao(List<User> users);

    /**
     * Retrieves all users from the database.
     *
     * @return a list of all users
     */
    List<User> getAllUsers();

    /**
     * Retrieves a user by their unique identifier.
     *
     * @param id the ID of the user
     * @return an optional containing the user if found, otherwise empty
     */
    Optional<User> getUserById(int id);

    /**
     * Updates a user identified by their ID with new details.
     *
     * @param id the ID of the user to be updated
     * @param user the updated user entity
     * @return an optional containing the updated user if the update was successful, otherwise empty
     */
    Optional<User> updateUserById(int id, User user);

    /**
     * Deletes a user from the database by their ID.
     *
     * @param id the ID of the user to be deleted
     * @return {@code true} if the deletion was successful, otherwise {@code false}.
     */
    boolean deleteUserById(int id);
}

