package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Entity
@Table(name = "Employees")
@Data
public class Employees implements Serializable {

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

    public Employees() {
    }

    public Employees(Long employeeID, String firstName, String lastName, String street, int zipCode, String city, double payRate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.payRate = payRate;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
