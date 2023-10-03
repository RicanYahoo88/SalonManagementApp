package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


@Getter
@Entity
@Table(name = "Zipcodes")
@Data
public class ZipCode implements Serializable {

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "zipcode")
    private int zipcode;

    public ZipCode() {
    }

    public ZipCode(String city, String state, int zipcode) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
