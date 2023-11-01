package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.ServicesRenderedRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.ServiceRendered;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServicesRenderedService {

    private final ServicesRenderedRepository servicesRenderedRepo;


    public ServicesRenderedService(ServicesRenderedRepository servicesRenderedRepo) {
        this.servicesRenderedRepo = servicesRenderedRepo;
    }

    public ServiceRendered addServiceRendered(ServiceRendered serviceRendered) {
        serviceRendered.setServiceID(UUID.randomUUID().toString());
        return servicesRenderedRepo.save(serviceRendered);

    }

    public List<ServiceRendered> findAllServicesRendered(){
        return servicesRenderedRepo.findAll();
    }

    public ServiceRendered updateServiceRendered(ServiceRendered serviceRendered){
        return servicesRenderedRepo.save(serviceRendered);
    }

    public ServiceRendered findServiceRenderedByServiceID(String serviceID){
        return servicesRenderedRepo.getReferenceById(serviceID);
    }

    public void deleteServiceRendered(String serviceID){
        servicesRenderedRepo.deleteServiceRenderedByServiceID(serviceID);
    }
}
