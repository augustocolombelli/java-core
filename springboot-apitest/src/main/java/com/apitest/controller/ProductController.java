package com.apitest.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<ProductResponseDTO> post(@RequestBody ProductRequestDTO requestDTO) {
        return ResponseEntity
                .ok()
                .body(new ProductResponseDTO(requestDTO.getId(), requestDTO.getDescription()));
    }
}
