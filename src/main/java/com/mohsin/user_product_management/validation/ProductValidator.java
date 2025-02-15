package com.mohsin.user_product_management.validation;

import com.mohsin.user_product_management.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator {
    /**
     * Custom method to validate a Product before saving/updating
     */
    public void validateProduct(Product product) {
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Product name is required");
        }
        if (product.getPrice() == 0 || product.getPrice() <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        if (product.getDescription() == null || product.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("Description is required");
        }
        if (product.getQuantity() == null || product.getQuantity().trim().isEmpty()) {
            throw new IllegalArgumentException("Quantity is required");
        }
    }
}
