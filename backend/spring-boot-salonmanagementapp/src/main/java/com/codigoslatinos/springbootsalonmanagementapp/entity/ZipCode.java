package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


@Getter
@Entity
@Table(name = "zipcode")
@Data
public class ZipCode implements Serializable {

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zip_code")
    private Long zipcode;

    public ZipCode() {
    }

    public ZipCode(String city, String state, Long zipcode) {
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

    public void setZipcode(Long zipcode) {
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
