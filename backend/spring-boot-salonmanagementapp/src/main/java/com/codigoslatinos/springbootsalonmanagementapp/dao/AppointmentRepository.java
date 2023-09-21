package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
