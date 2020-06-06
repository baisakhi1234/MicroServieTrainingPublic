package com.myCompany.myfirstspringbootdemo.rest;

import com.myCompany.myfirstspringbootdemo.model.BeerDto;
import com.myCompany.myfirstspringbootdemo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BeerConlroller {
    private BeerService beerService;

    @Autowired
    public BeerConlroller(BeerService beerService) {
        this.beerService = beerService;
    }

    @RequestMapping(value="/beers", method= RequestMethod.GET)
    public BeerDto getBeer(){
        return beerService.getBeer();
    }
}
