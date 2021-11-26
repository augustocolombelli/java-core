package com.apitest.controller;

import com.jayway.jsonpath.DocumentContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerIT {

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private String path;

    private final HttpHeaders httpHeaders = new HttpHeaders();
    private DocumentContext documentContext;

    @BeforeEach
    void initEach() {
        path = "http://localhost:" + port + "/api/v1/products";

        httpHeaders.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
    }

    @Test
    void shouldPostProduct() {
        String requestBody = "{\"id\": 15,\"description\":\"product a\"}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, httpHeaders);

        ResponseEntity<ProductResponseDTO> result =
                testRestTemplate.postForEntity(path, request, ProductResponseDTO.class);

        assertEquals(HttpStatus.OK.value(), result.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, result.getHeaders().getContentType());
        assertEquals(15l, result.getBody().getId(), 0);
        assertEquals("product a", result.getBody().getDescription());
    }

}
