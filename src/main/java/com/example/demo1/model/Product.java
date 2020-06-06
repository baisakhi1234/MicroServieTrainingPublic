package com.example.demo1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column (name = "productId")
    private int productId;
    @Column(name = "productType")
    @Enumerated (EnumType.STRING)
    private ProductType productType;
    @Column (name = "price")
    private double productPrice;

    public Product(String type,double price) {
        super();
        this.productType=ProductType.valueOf(type);
        this.productPrice=price;
    }
}
