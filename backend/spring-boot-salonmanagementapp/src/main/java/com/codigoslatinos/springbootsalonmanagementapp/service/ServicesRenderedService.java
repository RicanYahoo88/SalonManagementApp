package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.ServicesRenderedRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.ServicesRendered;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ServicesRenderedService {

    private final ServicesRenderedRepository servicesRenderedRepo;


    public ServicesRenderedService(ServicesRenderedRepository servicesRenderedRepo) {
        this.servicesRenderedRepo = servicesRenderedRepo;
    }

    public ServicesRendered addServiceRendered(ServicesRendered serviceRendered) {
        serviceRendered.setServiceID(Long.valueOf(UUID.randomUUID().toString()));
        return servicesRenderedRepo.save(serviceRendered);

    }

    public List<ServicesRendered> findAllServicesRendered(){
        return servicesRenderedRepo.findAll();
    }

    public ServicesRendered updateServiceRendered(ServicesRendered serviceRendered){
        return servicesRenderedRepo.save(serviceRendered);
    }

    public Optional<ServicesRendered> findServiceRenderedByServiceID(Long serviceID){
        return Optional.of(servicesRenderedRepo.getReferenceByServiceID(serviceID));
    }

    public void deleteServiceRendered(Long serviceID){
        servicesRenderedRepo.deleteServiceRenderedByServiceID(serviceID);
    }
}
