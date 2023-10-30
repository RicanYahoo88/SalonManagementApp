package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeByEmployeeID(Long employeeID);
}
