package com.example.demo1;

import com.example.demo1.model.Product;
import com.example.demo1.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo1.dao.ProductDao;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
    private ProductDao productDAO;

    @Autowired
    public Demo1Application(ProductDao productDAO) {
        super();
        this.productDAO = productDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


    @Override

    public void run(String... args) throws Exception {


        Product product1 = new Product("BOOKS", 80);

        Product product2 = new Product("ELECTRONICS", 280);

        Product product3 = new Product("COSMETICS", 10);

        productDAO.createProduct(product1);

        productDAO.createProduct(product2);

        productDAO.createProduct(product3);


    }

}
