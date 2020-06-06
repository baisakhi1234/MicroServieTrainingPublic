package com.myCompany.myfirstspringbootdemo.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeerDto {
    private UUID uid;
    private String type;
    private int price;
}
