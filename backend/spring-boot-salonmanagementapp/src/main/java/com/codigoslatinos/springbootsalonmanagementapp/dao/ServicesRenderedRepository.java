package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ServiceRendered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "servicesRendered", path = "services-rendered")
public interface ServicesRenderedRepository extends JpaRepository<ServiceRendered, String> {
    void deleteServiceRenderedByServiceID(String serviceID);

    ServiceRendered getReferenceByServiceID(String serviceID);
}
