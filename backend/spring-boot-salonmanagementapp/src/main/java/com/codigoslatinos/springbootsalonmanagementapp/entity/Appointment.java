package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
@Table(name = "Appointment")
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentID")
    private Long AppointmentID;

    @Column(name = "AppointmentDateTime")
    @CreationTimestamp
    private LocalDate AppointmentDateTime;

    @Column(name = "CustomerID")
    private Long CustomerID;

}
