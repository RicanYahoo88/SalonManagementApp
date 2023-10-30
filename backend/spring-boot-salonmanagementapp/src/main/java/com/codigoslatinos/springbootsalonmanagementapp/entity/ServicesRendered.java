package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "service_rendered")
@Data
public class ServicesRendered implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_ID")
    private Long serviceID;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "service_description")
    private String serviceDescription;

    @Column(name = "service_duration")
    private LocalDateTime serviceDuration;

    @Column(name = "service_price")
    private double servicePrice;

    @Column(name = "service_materials")
    private String serviceMaterials;

    public ServicesRendered() {
    }

    public ServicesRendered(Long serviceID, String serviceName, String serviceDescription, LocalDateTime serviceDuration, double servicePrice, String serviceMaterials) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceDuration = serviceDuration;
        this.servicePrice = servicePrice;
        this.serviceMaterials = serviceMaterials;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public void setServiceDuration(LocalDateTime serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public void setServiceMaterials(String serviceMaterials) {
        this.serviceMaterials = serviceMaterials;
    }

    @Override
    public String toString() {
        return "ServiceRendered{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDuration=" + serviceDuration +
                ", servicePrice=" + servicePrice +
                ", serviceMaterials='" + serviceMaterials + '\'' +
                '}';
    }
}