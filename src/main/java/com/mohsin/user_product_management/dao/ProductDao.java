package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.Product;
import com.mohsin.user_product_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductDao implements ProductsDao{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProductDao(Product product) {
        return null;
    }

    @Override
    public List<Product> saveMultiProductDao(List<Product> products) {
        return List.of();
    }

    @Override
    public List<Product> getAllProductDao() {
        return List.of();
    }

    @Override
    public Optional<Product> getProductByIdDao(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> updateProductByIdDao(int id, Product product) {
        return Optional.empty();
    }

    @Override
    public boolean deleteProductByIdDao(int id) {
        return false;
    }
}
