package com.apirest.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.apirest.entity.Factura;
import com.apirest.apirest.repository.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> findAll(){
        return facturaRepository.findAll();
    }
    public Factura save(Factura factura){
        return facturaRepository.save(factura);
    }

    public Factura getById(Integer id){
        return facturaRepository.findById(id).get();
    }
    public void delete(Integer id){
        facturaRepository.deleteById(id);
    }
}
