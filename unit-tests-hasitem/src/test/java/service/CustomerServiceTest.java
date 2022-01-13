package service;

import model.Customer;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomerServiceTest {

    private CustomerService service;

    @BeforeEach
    public void setUp(){
        service = new CustomerService();
    }

    @Test
    public void shouldGenerateTwoCustomers(){
        List<Customer> customers = service.generate("Customer A", "Customer B");

        assertThat(customers, hasItem((getMatcher(1, "Customer A"))));
        assertThat(customers, hasItem((getMatcher(2, "Customer B"))));
    }

    @Test
    public void shouldGenerateListWithTwoElements(){
        List<Customer> customers = service.generate("Customer A", "Customer B");

        assertThat(customers, hasSize(2));
    }

    private Matcher<Customer> getMatcher(Integer id, String name) {
        return allOf(
                hasProperty("id", equalTo(id)),
                hasProperty("name", equalTo(name))
        );
    }
}
