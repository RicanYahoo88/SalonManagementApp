package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.CustomerRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {
    private final CustomerRepository customerRepo;

    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer){
        customer.setCustomerID(UUID.randomUUID().toString());
        return customerRepo.save(customer);
    }
    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer findCustomerByCustomerId(String customerID) {
       return customerRepo.getReferenceById(customerID);
    }

    public void deleteCustomer(String customerID) {
        customerRepo.deleteCustomerByCustomerID(customerID);
    }

}
