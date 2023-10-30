package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

    @Getter
    @Entity
    @Table(name = "salon_services")
    @Data
    public class SalonServices implements Serializable {


        @Column(name = "appointment_ID")
        private Long appointmentID;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "line_item_number")
        private int lineItemNumber;

        @Column(name = "service_ID")
        private Long serviceID;

        @Column(name = "service_price")
        private double servicePrice;

        @Column(name = "employee_ID")
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
