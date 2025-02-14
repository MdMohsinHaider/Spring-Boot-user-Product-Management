package com.mohsin.user_product_management.repository;

import com.mohsin.user_product_management.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
