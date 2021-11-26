package com.apitest.controller;

public class ProductResponseDTO {

    private Long id;
    private String description;

    public ProductResponseDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
