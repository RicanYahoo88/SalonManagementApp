package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Getter
@Entity
@Table(name = "Appointment")
@Data
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "AppointmentID")
    private Long appointmentID;

    @Column(name = "AppointmentDateTime")
    @CreationTimestamp
    private LocalDate appointmentDateTime;

    @Column(name = "CustomerID")
    private Long customerID;

    public Appointment() {
    }

    public Appointment(Long appointmentID, LocalDate appointmentDateTime, Long customerID) {
        this.appointmentID = appointmentID;
        this.appointmentDateTime = appointmentDateTime;
        this.customerID = customerID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setAppointmentDateTime(LocalDate appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment that)) return false;
        return Objects.equals(getAppointmentID(), that.getAppointmentID()) && Objects.equals(getAppointmentDateTime(), that.getAppointmentDateTime()) && Objects.equals(getCustomerID(), that.getCustomerID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentID(), getAppointmentDateTime(), getCustomerID());
    }

}
