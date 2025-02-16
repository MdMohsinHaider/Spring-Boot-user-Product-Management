package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.entities.Product;

import java.util.List;
import java.util.Optional;

/**
 * Interface for Product Management Service.
 * Defines CRUD operations for managing products.
 *
 * @author Md Mohsin
 * @version 1.0
 */
public interface ProductsService {

    /**
     * Saves a new product in the database.
     *
     * @param product The product to be saved.
     * @return The saved product with a generated ID.
     */
    Product saveProduct(Product product);

    /**
     * Saves multiple products in the database in batch mode.
     *
     * @param products The list of products to be saved.
     * @return The list of saved products.
     */
    List<Product> saveMultipleProducts(List<Product> products);

    /**
     * Retrieves all available products from the database.
     *
     * @return A list of all products.
     */
    List<Product> getAllProducts();

    /**
     * Fetches a product by its unique ID.
     *
     * @param id The ID of the product.
     * @return An Optional containing the product if found, otherwise empty.
     */
    Optional<Product> getProductById(int id);

    /**
     * Updates a product by its ID with new values.
     *
     * @param id The ID of the product to update.
     * @param product The updated product details.
     * @return An Optional containing the updated product if the update is successful.
     */
    Optional<Product> updateProductById(int id, Product product);

    /**
     * Deletes a product by its ID.
     *
     * @param id The ID of the product to delete.
     * @return true if the deletion was successful, false otherwise.
     */
    boolean deleteProductById(int id);
}
