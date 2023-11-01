package com.codigoslatinos.springbootsalonmanagementapp.service;

import com.codigoslatinos.springbootsalonmanagementapp.dao.ZipCodeRepository;
import com.codigoslatinos.springbootsalonmanagementapp.entity.ZipCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ZipCodeService {

    private final ZipCodeRepository zipCodeRepo;

    public ZipCodeService(ZipCodeRepository zipCodeRepo) {
        this.zipCodeRepo = zipCodeRepo;
    }

    public ZipCode addZipCode(ZipCode zipcode){
        zipcode.setZipcode(zipcode.getZipcode());
        return zipCodeRepo.save(zipcode);
    }
    public List<ZipCode> findAllZipCodes() {
        return zipCodeRepo.findAll();
    }

    public ZipCode updateZipCode(ZipCode zipcode){
        return zipCodeRepo.save(zipcode);
    }

    public ZipCode findZipCode(String zipcode){
        return zipCodeRepo.getReferenceById(zipcode);
    }

    public void deleteZipCode(String zipcode){
        zipCodeRepo.deleteByZipcode(zipcode);
    }
}
