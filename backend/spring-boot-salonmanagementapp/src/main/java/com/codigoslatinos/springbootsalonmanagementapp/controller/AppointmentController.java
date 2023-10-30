package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.Appointment;
import com.codigoslatinos.springbootsalonmanagementapp.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Appointment>> getAllAppointments(){
        List<Appointment> appointments = appointmentService.findAllAppointments();
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }

    @GetMapping("/find/{appointment_ID}")
    public ResponseEntity<Appointment> getAppointmentByAppointment_ID(@PathVariable("appointment_ID") Long appointmentID) {
        Appointment appointment = appointmentService.findAppointmentByAppointmentId(appointmentID);
        return new ResponseEntity<>(appointment, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment){
        Appointment newAppointment = appointmentService.addAppointment(appointment);
        return new ResponseEntity<>(newAppointment, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment){
        Appointment updatedAppointment = appointmentService.updateAppointment(appointment);
        return new ResponseEntity<>(updatedAppointment, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{appointmentID}")
    public ResponseEntity<?> deleteAppointment(@PathVariable("appointmentID") Long appointmentID) {
    appointmentService.deleteAppointment(appointmentID);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
