package com.example.demo1.dao;

import com.example.demo1.model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProducts();
    public void createProduct(Product product);
}
