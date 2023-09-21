package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Zipcodes")
@Data
public class ZipCode {

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Id
    @Column(name = "zipcode")
    private int zipcode;
}
