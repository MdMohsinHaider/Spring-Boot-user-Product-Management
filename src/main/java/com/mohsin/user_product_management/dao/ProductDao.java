package com.mohsin.user_product_management.dao;

import com.mohsin.user_product_management.entities.Product;
import com.mohsin.user_product_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDao implements ProductsDao{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProductDao(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveMultiProductDao(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getAllProductDao() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductByIdDao(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Optional<Product> updateProductByIdDao(int id, Product product) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()){
            Product product1 = productOptional.get();

            product1.setName(product.getName());
            product1.setPrice(product.getPrice());
            product1.setQuantity(product.getQuantity());
            product1.setDescription(product.getDescription());

            productRepository.save(product1);
            return Optional.of(product1);
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteProductByIdDao(int id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
