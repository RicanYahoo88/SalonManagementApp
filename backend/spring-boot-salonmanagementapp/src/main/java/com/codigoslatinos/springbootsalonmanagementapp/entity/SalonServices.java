package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

    @Getter
    @Entity
    @Table(name = "SalonServices")
    @Data
    public class SalonServices implements Serializable {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name = "AppointmentID")
        private Long appointmentID;

        @Column(name = "LineItemNumber")
        private int lineItemNumber;

        @Column(name = "ServiceID")
        private Long serviceID;

        @Column(name = "ServicePrice")
        private double servicePrice;

        @Column(name = "EmployeeID")
        private Long employeeID;


        public SalonServices() {
        }

        public SalonServices(Long appointmentID, int lineItemNumber, Long serviceID, double servicePrice, Long employeeID) {
            this.appointmentID = appointmentID;
            this.lineItemNumber = lineItemNumber;
            this.serviceID = serviceID;
            this.servicePrice = servicePrice;
            this.employeeID = employeeID;
        }

        public void setAppointmentID(Long appointmentID) {
            this.appointmentID = appointmentID;
        }

        public void setLineItemNumber(int lineItemNumber) {
            this.lineItemNumber = lineItemNumber;
        }

        public void setServiceID(Long serviceID) {
            this.serviceID = serviceID;
        }

        public void setServicePrice(double servicePrice) {
            this.servicePrice = servicePrice;
        }

        public void setEmployeeID(Long employeeID) {
            this.employeeID = employeeID;
        }

        @Override
        public String toString() {
            return "ServicesRendered{" +
                    "appointmentID=" + appointmentID +
                    ", lineItemNumber=" + lineItemNumber +
                    ", serviceID=" + serviceID +
                    ", servicePrice=" + servicePrice +
                    ", employeeID=" + employeeID +
                    '}';
        }
    }
