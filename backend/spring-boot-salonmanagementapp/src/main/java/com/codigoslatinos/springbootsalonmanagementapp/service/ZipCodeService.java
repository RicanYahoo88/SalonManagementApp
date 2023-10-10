package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.ZipCodeRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.ZipCode;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ZipCodeService {

    private final ZipCodeRepository zipCodeRepo;

    public ZipCodeService(ZipCodeRepository zipCodeRepo) {
        this.zipCodeRepo = zipCodeRepo;
    }

    public ZipCode addZipCode(ZipCode zipcode){
        zipcode.setZipcode(Integer.parseInt(UUID.randomUUID().toString()));
        return zipCodeRepo.save(zipcode);
    }
    public List<ZipCode> findAllZipCodes() {
        return zipCodeRepo.findAll();
    }

    public ZipCode updateZipCode(ZipCode zipcode){
        return zipCodeRepo.save(zipcode);
    }

    public Optional<ZipCode> findZipCode(int zipcode){
        return Optional.of(zipCodeRepo.getReferenceById(zipcode));
    }

    public void deleteZipCode(int zipcode){
        zipCodeRepo.deleteByZipcode(zipcode);
    }
}
