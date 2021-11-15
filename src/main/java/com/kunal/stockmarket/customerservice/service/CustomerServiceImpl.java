package com.kunal.stockmarket.customerservice.service;

import com.kunal.stockmarket.customerservice.dao.CustomerDao;
import com.kunal.stockmarket.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customer.setCustomerId(UUID.randomUUID().toString());
        return customerDao.save(customer);
    }

    @Override
    public List<Customer> displayCustomerList() {
        return customerDao.findAll();
    }
}