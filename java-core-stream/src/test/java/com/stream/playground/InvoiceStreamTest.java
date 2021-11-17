package com.stream.playground;

import com.stream.model.Invoice;
import com.stream.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class InvoiceStreamTest {

    @Test
    public void shouldReturnLastInvoice(){
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1l, Instant.parse("2021-12-20T10:15:30.00Z"), BigDecimal.valueOf(45)));
        invoices.add(new Invoice(2l, Instant.parse("2021-12-20T13:15:30.00Z"), BigDecimal.valueOf(12)));
        invoices.add(new Invoice(3l, Instant.parse("2021-12-20T12:15:30.00Z"), BigDecimal.valueOf(4)));

        Invoice result = new InvoiceStream().getLastInvoice(invoices);

        Assertions.assertEquals(2l, result.getId().longValue());
    }

    @Test
    public void shouldReturnFirstInvoice(){
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1l, Instant.parse("2021-12-20T10:15:30.00Z"), BigDecimal.valueOf(45)));
        invoices.add(new Invoice(2l, Instant.parse("2021-12-20T07:15:30.00Z"), BigDecimal.valueOf(12)));
        invoices.add(new Invoice(3l, Instant.parse("2021-12-20T12:15:30.00Z"), BigDecimal.valueOf(4)));

        Invoice result = new InvoiceStream().getFirstInvoice(invoices);

        Assertions.assertEquals(2l, result.getId().longValue());
    }

}
