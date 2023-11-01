package com.codigoslatinos.springbootsalonmanagementapp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Getter
    @Entity
    @Table(name = "service_rendered")
    @Data
    public class ServiceRendered implements Serializable {


        @Column(name = "appointment_ID")
        private String appointmentID;


        @Column(name = "line_item_number")
        private int lineItemNumber;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "service_ID")
        private String serviceID;

        @Column(name = "service_price")
        private double servicePrice;

        @Column(name = "employee_ID")
        private String employeeID;

        @Column(name = "service_description")
        private String serviceDescription;

        @Column(name = "service_duration")
        private LocalDateTime serviceDuration;

        @Column(name = "service_materials")
        private String serviceMaterials;

        @Column(name = "service_name")
        private String serviceName;


    public ServiceRendered() {

    }

    public ServiceRendered(String appointmentID, int lineItemNumber, String serviceID, double servicePrice, String employeeID, String serviceDescription, LocalDateTime serviceDuration, String serviceMaterials, String serviceName) {
        this.appointmentID = appointmentID;
        this.lineItemNumber = lineItemNumber;
        this.serviceID = serviceID;
        this.servicePrice = servicePrice;
        this.employeeID = employeeID;
        this.serviceDescription = serviceDescription;
        this.serviceDuration = serviceDuration;
        this.serviceMaterials = serviceMaterials;
        this.serviceName = serviceName;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setLineItemNumber(int lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setServiceDuration(LocalDateTime serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public void setServiceMaterials(String serviceMaterials) {
        this.serviceMaterials = serviceMaterials;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRendered that = (ServiceRendered) o;
        return getLineItemNumber() == that.getLineItemNumber() && Double.compare(getServicePrice(), that.getServicePrice()) == 0 && Objects.equals(getAppointmentID(), that.getAppointmentID()) && Objects.equals(getServiceID(), that.getServiceID()) && Objects.equals(getEmployeeID(), that.getEmployeeID()) && Objects.equals(getServiceDescription(), that.getServiceDescription()) && Objects.equals(getServiceDuration(), that.getServiceDuration()) && Objects.equals(getServiceMaterials(), that.getServiceMaterials()) && Objects.equals(getServiceName(), that.getServiceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentID(), getLineItemNumber(), getServiceID(), getServicePrice(), getEmployeeID(), getServiceDescription(), getServiceDuration(), getServiceMaterials(), getServiceName());
    }

    @Override
    public String toString() {
        return "ServiceRendered{" +
                "appointmentID=" + appointmentID +
                ", lineItemNumber=" + lineItemNumber +
                ", serviceID=" + serviceID +
                ", servicePrice=" + servicePrice +
                ", employeeID=" + employeeID +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDuration=" + serviceDuration +
                ", serviceMaterials='" + serviceMaterials + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
