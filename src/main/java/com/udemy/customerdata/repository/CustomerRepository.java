package com.udemy.customerdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemy.customerdata.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
