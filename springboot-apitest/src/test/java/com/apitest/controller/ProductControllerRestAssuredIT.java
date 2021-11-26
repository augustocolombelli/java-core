package com.apitest.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static com.apitest.controller.ResourceUtils.getContentFromResource;
import static io.restassured.RestAssured.given;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerRestAssuredIT {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.port = port;
        RestAssured.basePath = "/api/v1/products";
    }

    @Test
    public void testWithRestAssured() throws JSONException {
        String inputJson = getContentFromResource("/json/post-product-request.json");

        Response response =
            given()
                .body(inputJson)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
            .when()
                .post()
            .then()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .response();

        String expectedResponseBodyJson = getContentFromResource("/json/post-product-response.json");

        assertEquals(expectedResponseBodyJson, response.getBody().asString(), true);
    }

}
