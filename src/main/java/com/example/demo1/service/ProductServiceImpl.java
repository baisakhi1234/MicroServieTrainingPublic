package com.example.demo1.service;

import com.example.demo1.dao.ProductDao;
import com.example.demo1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service ("productService")
public class ProductServiceImpl implements ProductService {
   private ProductDao productDao;
    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProducts();
    }

    @Override
    public Product createProduct(Product product) {
        return productDao.createProduct(product);
    }

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    @Override
    public void removeProduct(int id) {
        productDao.removeProduct(id);
    }
}
