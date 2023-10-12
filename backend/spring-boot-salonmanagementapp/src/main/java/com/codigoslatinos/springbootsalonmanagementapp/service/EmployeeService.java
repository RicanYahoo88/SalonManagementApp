package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.EmployeesRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeesRepository employeesRepo;


    public EmployeeService(EmployeesRepository employeesRepo) {
        this.employeesRepo = employeesRepo;
    }

    public Employees addEmployee(Employees employee) {
        employee.setEmployeeID(Long.valueOf(UUID.randomUUID().toString()));
        return employeesRepo.save(employee);
    }

    public List<Employees> findAllEmployees() {
        return employeesRepo.findAll();
    }

    public Employees updateEmployee(Employees employee) {
        return employeesRepo.save(employee);
    }


    public void deleteEmployee(Long employeeID) {
        employeesRepo.deleteEmployeeByEmployeeID(employeeID);
    }

    public Employees findByEmployeeID(Long employeeID) {
        return employeesRepo.getReferenceById(employeeID);
    }
}

