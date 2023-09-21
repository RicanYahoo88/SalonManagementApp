package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Employees")
@Data
public class Employees {

    @Id
    @GeneratedValue
    @Column(name = "EmployeeID")
    private Long employeeID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Street")
    private String street;

    @Column(name = "ZipCode")
    private int zipCode;

    @Column(name = "City")
    private String city;

    @Column(name = "PayRate")
    private double payRate;
}
