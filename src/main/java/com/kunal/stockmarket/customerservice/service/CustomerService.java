package com.kunal.stockmarket.customerservice.service;

import com.kunal.stockmarket.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createCustomer(Customer customer);
    public List<Customer> displayCustomerList();
}