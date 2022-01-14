package com.stream.playground;

import com.stream.dto.CustomerResponse;
import com.stream.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapWithFunctionTest {

    private MapWithFunction mapWithFunction;

    @BeforeEach
    public void setUp(){
        mapWithFunction = new MapWithFunction();
    }

    @Test
    public void shouldConvertCustomerToCustomerResponse(){
        Customer customerOne = new Customer.Builder().id(1L).name("Test one").internalNotes("notes one").build();
        Customer customerTwo = new Customer.Builder().id(2L).name("Test two").internalNotes("notes two").build();
        Customer customerThree = new Customer.Builder().id(3L).name("Test three").internalNotes("notes three").build();

        List<Customer> customers = Arrays.asList(customerOne, customerTwo, customerThree);

        List<CustomerResponse> result = mapWithFunction.convert(customers);

        assertEquals(1L, result.get(0).getId().longValue());
        assertEquals(2L, result.get(1).getId().longValue());
        assertEquals(3L, result.get(2).getId().longValue());
        assertEquals("Test one", result.get(0).getName());
        assertEquals("Test two", result.get(1).getName());
        assertEquals("Test three", result.get(2).getName());
    }

}
