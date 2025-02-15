package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsService {

    Product saveProduct(Product product);
    List<Product> saveMultipleProducts(List<Product> products);
    List<Product> getAllProducts();
    Optional<Product> getProductById(int id);
    Optional<Product> updateProductById(int id, Product product);
    boolean deleteProductById(int id);
}
