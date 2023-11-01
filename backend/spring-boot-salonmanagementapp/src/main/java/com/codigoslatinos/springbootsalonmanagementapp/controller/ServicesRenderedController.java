package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ServiceRendered;
import com.codigoslatinos.springbootsalonmanagementapp.service.ServicesRenderedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicerendered")
public class ServicesRenderedController {

    private final ServicesRenderedService servicesRenderedService;


    public ServicesRenderedController(ServicesRenderedService servicesRenderedService) {
        this.servicesRenderedService = servicesRenderedService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ServiceRendered>> getAllServicesRendered() {
        List<ServiceRendered> serviceRendered = servicesRenderedService.findAllServicesRendered();
        return new ResponseEntity<>(serviceRendered, HttpStatus.OK);
    }

    @GetMapping("/find/{serviceID}")
    public ResponseEntity<ServiceRendered> getServicesRenderedByServiceID(@PathVariable("serviceID") String serviceID) {
        ServiceRendered serviceRendered =  servicesRenderedService.findServiceRenderedByServiceID(serviceID);
        return new ResponseEntity<>(serviceRendered, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<ServiceRendered> addServicesRendered(@RequestBody ServiceRendered serviceRendered) {
        ServiceRendered newServiceRendered = servicesRenderedService.addServiceRendered(serviceRendered);
        return new ResponseEntity<>(newServiceRendered, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ServiceRendered> updateServicesRendered(@RequestBody ServiceRendered serviceRendered) {
        ServiceRendered updatedServiceRendered = servicesRenderedService.updateServiceRendered(serviceRendered);
        return new ResponseEntity<>(updatedServiceRendered, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{serviceID}")
    public ResponseEntity<?> deleteServiceRendered(@PathVariable("serviceID") String serviceID) {
        servicesRenderedService.deleteServiceRendered(serviceID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
