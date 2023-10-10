package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.SalonServicesRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.SalonServices;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SalonServicesService {

    private final SalonServicesRepository salonServicesRepo;


    public SalonServicesService(SalonServicesRepository salonServicesRepo) {
        this.salonServicesRepo = salonServicesRepo;
    }
    public SalonServices addSalonService(SalonServices salonService) {
        salonService.setAppointmentID(Long.valueOf(UUID.randomUUID().toString()));
        return salonServicesRepo.save(salonService);

    }

    public List<SalonServices> findAllSalonServices(){
        return salonServicesRepo.findAll();
    }

    public SalonServices updateSalonService(SalonServices salonService){
        return salonServicesRepo.save(salonService);
    }

    public Optional<SalonServices> findSalonServiceByAppointmentID(Long appointmentID){
        return Optional.of(salonServicesRepo.getReferenceByAppointmentID(appointmentID));
    }

    public void deleteSalonServiceByAppointmentID(Long appointmentID){
        salonServicesRepo.deleteSalonServiceByAppointmentID(appointmentID);
    }

}