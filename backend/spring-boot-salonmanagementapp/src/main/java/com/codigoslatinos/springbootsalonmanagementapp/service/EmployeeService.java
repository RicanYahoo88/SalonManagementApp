package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.EmployeeRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepo;


    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeID(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }


    public void deleteEmployee(String employeeID) {
        employeeRepo.deleteEmployeeByEmployeeID(employeeID);
    }

    public Employee findByEmployeeID(String employeeID) {
        return employeeRepo.getReferenceById(employeeID);
    }
}

