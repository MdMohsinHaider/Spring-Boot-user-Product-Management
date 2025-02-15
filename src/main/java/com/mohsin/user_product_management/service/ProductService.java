package com.mohsin.user_product_management.service;

import com.mohsin.user_product_management.dao.ProductsDao;
import com.mohsin.user_product_management.entities.Product;
import com.mohsin.user_product_management.validation.ProductValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductsService {

    @Autowired
    private ProductsDao dao;

    @Autowired
    private ProductValidator productValidator;

    @Override
    public Product saveProduct(Product product) {
        productValidator.validateProduct(product);
        return dao.saveProductDao(product);
    }

    @Override
    public List<Product> saveMultipleProducts(List<Product> products) {
        for (Product product : products) {
            productValidator.validateProduct(product);
        }
        return dao.saveMultiProductDao(products);
    }

    @Override
    public List<Product> getAllProducts() {
        return dao.getAllProductDao();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return dao.getProductByIdDao(id);
    }

    @Override
    public Optional<Product> updateProductById(int id, Product product) {
        productValidator.validateProduct(product);
        return dao.updateProductByIdDao(id, product);
    }

    @Override
    public boolean deleteProductById(int id) {
        return dao.deleteProductByIdDao(id);
    }
}
