package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Employees;
import com.codigoslatinos.springbootsalonmanagementapp.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Employees>> getAllEmployees() {
        List<Employees> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{employeeID}")
    public ResponseEntity<Employees> getEmployeeByEmployeeID(@PathVariable("employeeID") Long employeeID) {
        Employees employee = employeeService.findByEmployeeID(employeeID);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee) {
        Employees newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employees> updateEmployee(@RequestBody Employees employee) {
        Employees updatedEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeID}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("employeeID") Long employeeID) {
        employeeService.deleteEmployee(employeeID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
