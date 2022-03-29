package com.bharath.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.bankapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
