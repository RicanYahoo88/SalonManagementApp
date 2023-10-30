package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.SalonServicesRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.SalonServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
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

    public SalonServices findSalonServiceByLineItemNumber(int lineItemNumber){
        return salonServicesRepo.getReferenceByLineItemNumber(lineItemNumber);
    }

    public void deleteSalonServiceByLineItemNumber(int lineItemNumber){
        salonServicesRepo.deleteSalonServiceByLineItemNumber(lineItemNumber);
    }

}
