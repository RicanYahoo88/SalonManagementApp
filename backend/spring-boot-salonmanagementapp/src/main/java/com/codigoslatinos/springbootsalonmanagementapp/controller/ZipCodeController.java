package com.codigoslatinos.springbootsalonmanagementapp.controller;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ZipCode;
import com.codigoslatinos.springbootsalonmanagementapp.service.ZipCodeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zipcode")
public class ZipCodeController {

    private final ZipCodeService zipCodeService;

    public ZipCodeController(ZipCodeService zipCodeService) {
        this.zipCodeService = zipCodeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ZipCode>> getAllZipCodes() {
        List<ZipCode> zipCodes = zipCodeService.findAllZipCodes();
        return new ResponseEntity<>(zipCodes, HttpStatus.OK);
    }

    @GetMapping("/find/{zipcode}")
    public ResponseEntity<ZipCode> getZipCodeByZipcode(@PathVariable("zipcode") String zipcode) {
        ZipCode zipCode = zipCodeService.findZipCode(zipcode);
        return new ResponseEntity<>(zipCode, HttpStatus.OK);

    }
    @PostMapping("/add")
    public ResponseEntity<ZipCode> addZipCode(@RequestBody ZipCode zipCode) {
        ZipCode newZipCode =zipCodeService.addZipCode(zipCode);
        return new ResponseEntity<>(newZipCode, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ZipCode> updateEmployee(@RequestBody ZipCode zipCode) {
        ZipCode updatedZipcode = zipCodeService.updateZipCode(zipCode);
        return new ResponseEntity<>(updatedZipcode, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{zipcode}")
    public ResponseEntity<?> deleteZipcode(@PathVariable("zipcode") String zipCode) {
        zipCodeService.deleteZipCode(zipCode);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
