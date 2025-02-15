package com.mohsin.user_product_management.controller;

import com.mohsin.user_product_management.dao.ProductsDao;
import com.mohsin.user_product_management.entities.Product;
import com.mohsin.user_product_management.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
@CrossOrigin(value = "http://localhost:5173")
public class ProductController {

    @Autowired(required = true)
    private ProductsService service;

    @PostMapping(value = "/saveProduct")
    public Product saveProductController(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping(value = "/saveMultipleProducts")
    public List<Product> saveMultipleProducts(@RequestBody List<Product> products) {
        return service.saveMultipleProducts(products);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping(value = "/getProductById/{id}")
    public Optional<Product> getProductById(@PathVariable(name = "id") int id) {
        return service.getProductById(id);
    }

    @PutMapping(value = "/updateProductById/{id}")
    public Optional<Product> updateProductById(@PathVariable(name = "id") int id, @RequestBody Product product) {
        return  service.updateProductById(id,product);
    }

    @DeleteMapping(value = "/deleteProductById/{id}")
    public boolean deleteProductById(@PathVariable int id) {
        return service.deleteProductById(id);
    }
}
