package com.example.demo1.service;

import com.example.demo1.model.Product;
import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product createProduct(Product product);
    public Product getProductById(int id);
    public void removeProduct(int id);
}
