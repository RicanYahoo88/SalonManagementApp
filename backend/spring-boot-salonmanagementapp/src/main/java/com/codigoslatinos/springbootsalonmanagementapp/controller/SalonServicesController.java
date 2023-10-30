package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.SalonServices;
import com.codigoslatinos.springbootsalonmanagementapp.service.SalonServicesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salonservices")
public class SalonServicesController {

    private final SalonServicesService salonServicesService;

    public SalonServicesController(SalonServicesService salonServicesService) {
        this.salonServicesService = salonServicesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SalonServices>> getAllSalonServices() {
        List<SalonServices> salonServices = salonServicesService.findAllSalonServices();
        return new ResponseEntity<>(salonServices, HttpStatus.OK);
    }
    @GetMapping("/find/{lineitemnumber}")
    public ResponseEntity<SalonServices> getSalonServiceByLineItemNumber(@PathVariable("lineitemnumber") int lineItemNumber) {
        SalonServices salonService = salonServicesService.findSalonServiceByLineItemNumber(lineItemNumber);
        return new ResponseEntity<>(salonService, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<SalonServices> addSalonService(@RequestBody SalonServices salonService) {
        SalonServices newSalonService = salonServicesService.addSalonService(salonService);
        return new ResponseEntity<>(newSalonService, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<SalonServices> updateSalonService(@RequestBody SalonServices salonService) {
        SalonServices newSalonService = salonServicesService.updateSalonService(salonService);
        return new ResponseEntity<>(newSalonService, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{lineitemnumber}")
    public ResponseEntity<?> deleteSalonService(@PathVariable("lineitemnumber") int lineItemNumber) {
        salonServicesService.deleteSalonServiceByLineItemNumber(lineItemNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
