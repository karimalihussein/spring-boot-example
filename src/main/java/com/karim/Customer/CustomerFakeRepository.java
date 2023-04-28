package com.karim.Customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Karim"),
                new Customer(2L,"Ahmed"),
                new Customer(3L,"Mohamed")
        );
    }

}
