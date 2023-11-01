package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.AppointmentRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public Appointment findAppointmentByAppointmentId(String appointmentID){
        return appointmentRepo.getReferenceById(appointmentID);
    }
    public void deleteAppointment(String appointmentID) {
        appointmentRepo.deleteAppointmentByAppointmentID(appointmentID);
    }
}
