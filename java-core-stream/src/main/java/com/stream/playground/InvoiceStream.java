package com.stream.playground;

import com.stream.model.Invoice;

import java.util.Comparator;
import java.util.List;

public class InvoiceStream {
    public Invoice getLastInvoice(List<Invoice> invoices) {
        return invoices
                .stream()
                .max(Comparator.comparing(Invoice::getTime))
                .get();
    }

    public Invoice getFirstInvoice(List<Invoice> invoices) {
        return invoices
                .stream()
                .min(Comparator.comparing(Invoice::getTime))
                .get();
    }
}
