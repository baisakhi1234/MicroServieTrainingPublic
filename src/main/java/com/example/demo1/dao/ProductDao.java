package com.example.demo1.dao;

import com.example.demo1.exception.ProductNotFoundException;
import com.example.demo1.model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProducts();
    public Product createProduct(Product product);
    public Product getProductById(int id) throws ProductNotFoundException;
    public void removeProduct(int id);
    public Product updateProduct(Product product);
}
