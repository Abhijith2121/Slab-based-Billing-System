package com.electricity.bill.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electricity.bill.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>  {
	Optional<Customer> findByEmail(String email);
}