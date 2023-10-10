package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.SalonServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonServicesRepository extends JpaRepository<SalonServices, Long> {

    void deleteSalonServiceByAppointmentID(Long appointmentID);

    SalonServices getReferenceByAppointmentID(Long appointmentID);
}
