package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "Appointment")
@Data
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "AppointmentID")
    private Long AppointmentID;

    @Column(name = "AppointmentDateTime")
    @CreationTimestamp
    private LocalDate AppointmentDateTime;

    @Column(name = "CustomerID")
    private Long CustomerID;

    public Appointment() {
    }

    public Appointment(Long appointmentID, LocalDate appointmentDateTime, Long customerID) {
        AppointmentID = appointmentID;
        AppointmentDateTime = appointmentDateTime;
        CustomerID = customerID;
    }

    public void setAppointmentID(Long appointmentID) {
        AppointmentID = appointmentID;
    }

    public void setAppointmentDateTime(LocalDate appointmentDateTime) {
        AppointmentDateTime = appointmentDateTime;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "AppointmentID=" + AppointmentID +
                ", AppointmentDateTime=" + AppointmentDateTime +
                ", CustomerID=" + CustomerID +
                '}';
    }
}
