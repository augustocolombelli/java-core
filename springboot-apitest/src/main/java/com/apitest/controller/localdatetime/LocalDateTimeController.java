package com.apitest.controller.localdatetime;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/localdatetime")
public class LocalDateTimeController {

    @PostMapping
    public ResponseEntity<Void> post(@Validated @RequestBody LocalDateTimeRequest requestDTO) {
        return ResponseEntity.ok().build();
    }
}
