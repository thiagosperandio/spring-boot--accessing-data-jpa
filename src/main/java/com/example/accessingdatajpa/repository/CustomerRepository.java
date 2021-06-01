package com.example.accessingdatajpa.repository;

import java.util.List;

import com.example.accessingdatajpa.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);


    List<Customer> findByFirstNameOrLastName(String firstName,  String lastName);

    default List<Customer> findByFirstNameOrLastName(String name) {
      return findByFirstNameOrLastName(name, name);
    }
  }
