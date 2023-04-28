package com.karim.Customer;

public class Customer {
    private final Long id;
    private final String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }

}
