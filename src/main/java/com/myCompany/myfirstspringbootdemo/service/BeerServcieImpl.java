package com.myCompany.myfirstspringbootdemo.service;

import com.myCompany.myfirstspringbootdemo.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("beerService")
public class BeerServcieImpl implements BeerService {
    @Override
    public BeerDto getBeer() {
        return BeerDto.builder().uid(UUID.randomUUID())
                .price(230).type("Strong").build();

    }
}
