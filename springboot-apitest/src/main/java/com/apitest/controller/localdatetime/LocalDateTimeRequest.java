package com.apitest.controller.localdatetime;

import com.apitest.controller.localdatetime.validator.SpecificDataConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class LocalDateTimeRequest {

    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @SpecificDataConstraint
    private LocalDateTime localDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
