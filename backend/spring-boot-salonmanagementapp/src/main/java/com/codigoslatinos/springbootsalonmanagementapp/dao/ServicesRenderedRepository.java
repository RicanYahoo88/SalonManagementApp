package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ServicesRendered;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRenderedRepository extends JpaRepository<ServicesRendered, Long> {
    void deleteServiceRenderedByServiceID(Long serviceID);

    ServicesRendered getReferenceByServiceID(Long serviceID);
}
