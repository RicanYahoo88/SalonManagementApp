package com.codigoslatinos.springbootsalonmanagementapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SalonServices")
@Data
public class SalonServices {

    @Id
    @GeneratedValue
    @Column(name = "ServiceID")
    private Long ServiceID;

    @Column(name = "ServiceName")
    private String ServiceName;

    @Column(name = "ServiceDescription")
    private String ServiceDescription;

    @Column(name = "ServiceDuration")
    private int ServiceDuration;

    @Column(name = "ServicePrice")
    private double ServicePrice;

    @Column(name = "ServiceMaterials")
    private String ServiceMaterials;

}
