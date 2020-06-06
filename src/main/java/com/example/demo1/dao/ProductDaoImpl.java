package com.example.demo1.dao;

import com.example.demo1.model.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("productDao")
@EnableAutoConfiguration
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao{
    private EntityManager entityManager;
    @Autowired
    public ProductDaoImpl(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        Session session=entityManager.unwrap(Session.class);
        TypedQuery<Product> query=session.createQuery("From Product",Product.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void createProduct(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.save(product);
    }
}
