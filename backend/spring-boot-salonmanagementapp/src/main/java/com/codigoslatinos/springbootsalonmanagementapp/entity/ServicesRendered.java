package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Entity
@Table(name = "ServicesRendered")
@Data
public class ServicesRendered implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ServiceID")
    private Long serviceID;

    @Column(name = "ServiceName")
    private String serviceName;

    @Column(name = "ServiceDescription")
    private String serviceDescription;

    @Column(name = "ServiceDuration")
    private int serviceDuration;

    @Column(name = "ServicePrice")
    private double servicePrice;

    @Column(name = "ServiceMaterials")
    private String serviceMaterials;

    public ServicesRendered() {
    }

    public ServicesRendered(Long serviceID, String serviceName, String serviceDescription, int serviceDuration, double servicePrice, String serviceMaterials) {
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

    public void setServiceDuration(int serviceDuration) {
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