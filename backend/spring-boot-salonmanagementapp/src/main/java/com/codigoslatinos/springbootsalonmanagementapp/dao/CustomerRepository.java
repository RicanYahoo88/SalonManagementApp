package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
