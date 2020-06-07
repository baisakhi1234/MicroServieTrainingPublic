package com.example.demo1.exception;

public class ProductNotFoundException  extends Exception{
    private int id;

    public ProductNotFoundException(int id ) {
        super();
        this.id=id;
    }

    public String getCustomMessage(){
        return "Product Not Found with id "+this.id ;
    }
}
