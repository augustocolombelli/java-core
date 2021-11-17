package com.stream.model;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private BigDecimal value;

    public Product(Long id, BigDecimal value){
        this.id = id;
        this.value = value;
    }

    public Long getId(){
        return this.id;
    }

    public BigDecimal getValue(){
        return this.value;
    }

}
