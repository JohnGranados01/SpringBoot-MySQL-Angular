package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirest.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{
    
}
