package com.playground;

import com.model.Invoice;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntervalInvoice {

    public List<Invoice> getInvoicesLastWeek(Clock clock, List<Invoice> invoices) {
        IntervalDate intervalDatePreviousWeek = IntervalDate.previousWeek(clock);

        return invoices
                .stream()
                .filter(invoice ->
                        invoice.getTime().isBefore(intervalDatePreviousWeek.getEnd()) &&
                        invoice.getTime().isAfter(intervalDatePreviousWeek.getStart()))
                .collect(Collectors.toList());
    }
}
