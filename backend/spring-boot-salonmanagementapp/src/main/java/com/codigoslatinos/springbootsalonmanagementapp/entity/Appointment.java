package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;



@Getter
@Entity
@Table(name = "appointment")
@Data
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_ID")
    private String appointmentID;

    @Column(name = "appointment_date_time")
    @CreationTimestamp
    private LocalDate appointmentDateTime;

    @Column(name = "customer_ID")
    private String customerID;


    public Appointment() {
    }

    public Appointment(String appointmentID, LocalDate appointmentDateTime, String customerID) {
        this.appointmentID = appointmentID;
        this.appointmentDateTime = appointmentDateTime;
        this.customerID = customerID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setAppointmentDateTime(LocalDate appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(getAppointmentID(), that.getAppointmentID()) && Objects.equals(getAppointmentDateTime(), that.getAppointmentDateTime()) && Objects.equals(getCustomerID(), that.getCustomerID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentID(), getAppointmentDateTime(), getCustomerID());
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", appointmentDateTime=" + appointmentDateTime +
                ", customerID=" + customerID +
                '}';
    }
}
