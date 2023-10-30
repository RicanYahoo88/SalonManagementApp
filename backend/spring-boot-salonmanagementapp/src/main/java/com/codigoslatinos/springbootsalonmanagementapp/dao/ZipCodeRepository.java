package com.codigoslatinos.springbootsalonmanagementapp.dao;

import com.codigoslatinos.springbootsalonmanagementapp.entity.ZipCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
    void deleteByZipcode(Long zipcode);
}
