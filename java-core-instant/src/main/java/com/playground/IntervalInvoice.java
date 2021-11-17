package com.playground;

import com.model.Invoice;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

public class IntervalInvoice {

    public List<Invoice> getInvoicesLastWeek(Clock clock, List<Invoice> invoices) {
        IntervalDate intervalDatePreviousWeek = IntervalDate.previousWeek(clock);

        List<Invoice> invoicesLastWeek = new ArrayList<>();
        for(Invoice invoice : invoices){
            if(invoice.getTime().isBefore(intervalDatePreviousWeek.getEnd()) &&
                    invoice.getTime().isAfter(intervalDatePreviousWeek.getStart())){
                invoicesLastWeek.add(invoice);
            }
        }
        return  invoicesLastWeek;
    }
}
