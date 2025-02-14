package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.Product;
import java.util.List;
import java.util.Optional;

/**
 * The {@code ProductsDao} interface provides methods for performing CRUD operations on Product entities.
 * It defines methods to save, retrieve, update, and delete product records.
 *
 * @author Md Mohsin Haider
 * @version 1.0
 * @since 2025
 */
public interface ProductsDao {

    /**
     * Saves a single product to the database.
     *
     * @param product The product entity to be saved.
     * @return The saved product with an assigned ID.
     */
    Product saveProductDao(Product product);

    /**
     * Saves multiple products to the database in bulk.
     *
     * @param products A list of products to be saved.
     * @return A list of saved product entities.
     */
    List<Product> saveMultiProductDao(List<Product> products);

    /**
     * Retrieves all products from the database.
     *
     * @return A list of all available products.
     */
    List<Product> getAllProductDao();

    /**
     * Retrieves a product by its unique identifier.
     *
     * @param id The unique ID of the product.
     * @return An {@code Optional} containing the product if found, otherwise empty.
     */
    Optional<Product> getProductByIdDao(int id);

    /**
     * Updates a product identified by its ID with new details.
     *
     * @param id The unique ID of the product to be updated.
     * @param product The updated product details.
     * @return An {@code Optional} containing the updated product if the update was successful, otherwise empty.
     */
    Optional<Product> updateProductByIdDao(int id, Product product);

    /**
     * Deletes a product from the database by its ID.
     *
     * @param id The unique ID of the product to be deleted.
     * @return {@code true} if the deletion was successful, otherwise {@code false}.
     */
    boolean deleteProductByIdDao(int id);
}
