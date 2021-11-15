package com.kunal.stockmarket.customerservice.dao;

import com.kunal.stockmarket.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends MongoRepository<Customer,String> {
}