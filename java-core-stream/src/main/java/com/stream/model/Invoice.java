package com.stream.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Invoice {

    private Long id;
    private Instant time;
    private BigDecimal value;

    public Invoice(Long id, Instant time, BigDecimal value){
        this.id = id;
        this.time = time;
        this.value = value;
    }

    public Long getId(){
        return this.id;
    }

    public Instant getTime(){
        return this.time;
    }

    public BigDecimal getValue(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(id, invoice.id) && Objects.equals(time, invoice.time) && Objects.equals(value, invoice.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value);
    }
}
