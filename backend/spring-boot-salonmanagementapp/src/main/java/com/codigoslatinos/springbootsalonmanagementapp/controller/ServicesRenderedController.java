package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ServicesRendered;
import com.codigoslatinos.springbootsalonmanagementapp.service.ServicesRenderedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicesrendered")
public class ServicesRenderedController {

    private final ServicesRenderedService servicesRenderedService;


    public ServicesRenderedController(ServicesRenderedService servicesRenderedService) {
        this.servicesRenderedService = servicesRenderedService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ServicesRendered>> getAllServicesRendered() {
        List<ServicesRendered> servicesRendered = servicesRenderedService.findAllServicesRendered();
        return new ResponseEntity<>(servicesRendered, HttpStatus.OK);
    }

    @GetMapping("/find/{serviceID}")
    public ResponseEntity<ServicesRendered> getServicesRenderedByServiceID(@PathVariable("serviceID") Long serviceID) {
        ServicesRendered serviceRendered =  servicesRenderedService.findServiceRenderedByServiceID(serviceID);
        return new ResponseEntity<>(serviceRendered, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<ServicesRendered> addServicesRendered(@RequestBody ServicesRendered serviceRendered) {
        ServicesRendered newServiceRendered = servicesRenderedService.addServiceRendered(serviceRendered);
        return new ResponseEntity<>(newServiceRendered, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ServicesRendered> updateServicesRendered(@RequestBody ServicesRendered servicesRendered) {
        ServicesRendered updatedServicesRendered = servicesRenderedService.updateServiceRendered(servicesRendered);
        return new ResponseEntity<>(updatedServicesRendered, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{serviceID}")
    public ResponseEntity<?> deleteServiceRendered(@PathVariable("serviceID") Long serviceID) {
        servicesRenderedService.deleteServiceRendered(serviceID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
