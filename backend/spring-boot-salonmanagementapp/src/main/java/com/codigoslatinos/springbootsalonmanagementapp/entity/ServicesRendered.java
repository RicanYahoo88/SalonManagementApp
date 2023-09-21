package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "ServicesRendered")
@Data
public class ServicesRendered {

    @Id
    @GeneratedValue
    @Column(name = "ApppointmentID")
    private Long appointmentID;

    @Column(name = "LineItemNumber")
    private int lineItemNumber;


    @OneToMany(mappedBy = "servicesRendered", cascade = CascadeType.ALL)
    @Column(name = "ServiceID")
    private Set<SalonServices> serviceID;

    @Column(name = "ServicePrice")
    private double servicePrice;

    @Column(name = "EmployeeID")
    private Long employeeID;




}