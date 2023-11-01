package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.SalonServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "salonServices", path = "salon-services")
public interface SalonServicesRepository extends JpaRepository<SalonServices, String> {


    void deleteSalonServiceByServiceID(String serviceID);
}
