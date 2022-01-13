package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public List<Customer> generate(String... names) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            customers.add(new Customer(i + 1, names[i]));
        }
        return customers;
    }

}
