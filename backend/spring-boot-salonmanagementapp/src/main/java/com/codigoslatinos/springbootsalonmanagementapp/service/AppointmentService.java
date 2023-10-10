package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.AppointmentRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.Appointment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AppointmentService {

    private final AppointmentRepository appointmentRepo;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepo = appointmentRepository;
    }
    public Appointment addAppointment(Appointment appointment) {
        appointment.setAppointmentDateTime(appointment.getAppointmentDateTime());
        return appointmentRepo.save(appointment);
    }

    public List<Appointment> findAllAppointments() {
        return appointmentRepo.findAll();
    }

    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepo.save(appointment);
    }

    public Optional<Appointment> findAppointmentById(Long appointmentID){
        return Optional.of(appointmentRepo.getReferenceById(appointmentID));
    }
    public void deleteAppointment(Long appointmentID) {
        appointmentRepo.deleteAppointmentByAppointmentID(appointmentID);
    }
}
