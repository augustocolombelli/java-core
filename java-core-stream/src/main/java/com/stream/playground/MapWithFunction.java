package com.stream.playground;

import com.stream.dto.CustomerResponse;
import com.stream.model.Customer;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapWithFunction {

    public List<CustomerResponse> convert(List<Customer> customers){
        return customers
                    .stream()
                    .map(customerToCustomerResponse())
                    .collect(Collectors.toList());
    }

    private Function<Customer, CustomerResponse> customerToCustomerResponse() {
        return customer -> new CustomerResponse.Builder()
                .id(customer.getId())
                .name(customer.getName())
                .build();
    }

}
