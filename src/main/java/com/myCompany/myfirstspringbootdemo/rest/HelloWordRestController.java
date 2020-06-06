package com.myCompany.myfirstspringbootdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {

    @RequestMapping ("/hello")
    public String sayHello(){
        return "Hello World spring boot";
    }
}
