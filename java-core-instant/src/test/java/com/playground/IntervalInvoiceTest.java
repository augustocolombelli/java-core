package com.playground;

import com.model.Invoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class IntervalInvoiceTest {

    @Test
    public void shouldReturnTimesLastWeek(){
        Clock clock = Clock.fixed(Instant.parse("2021-11-17T10:00:00Z"), ZoneOffset.UTC);

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1l, Instant.parse("2021-11-06T10:15:30.00Z"), BigDecimal.valueOf(45)));
        invoices.add(new Invoice(2l, Instant.parse("2021-11-07T07:15:30.00Z"), BigDecimal.valueOf(12)));
        invoices.add(new Invoice(3l, Instant.parse("2021-11-08T12:15:30.00Z"), BigDecimal.valueOf(4)));
        invoices.add(new Invoice(4l, Instant.parse("2021-11-15T12:15:30.00Z"), BigDecimal.valueOf(2)));
        invoices.add(new Invoice(5l, Instant.parse("2021-11-09T12:15:30.00Z"), BigDecimal.valueOf(2)));
        invoices.add(new Invoice(6l, Instant.parse("2021-11-10T12:15:30.00Z"), BigDecimal.valueOf(2)));

        List<Invoice> result =
                new IntervalInvoice().getInvoicesLastWeek(clock, invoices);

        Assertions.assertEquals(4l, result.size());


    }

}
