package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}
