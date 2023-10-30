package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Customer;
import com.codigoslatinos.springbootsalonmanagementapp.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }


    @GetMapping("/find/{customerID}")
    public ResponseEntity<Customer> getCustomerByCustomerID(@PathVariable("customerID") Long customerID) {
        Customer customer = customerService.findCustomerByCustomerId(customerID);
        return new ResponseEntity<>(customer, HttpStatus.OK);


    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(customer);
        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{customerID}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("customerID") Long customerID) {
        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
