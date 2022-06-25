package com.apirest.apirest.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.entity.Factura;
import com.apirest.apirest.service.FacturaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/apirest/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/save")
    public ResponseEntity<Factura> save(@RequestBody Factura factura){
        return new ResponseEntity<>(facturaService.save(factura), HttpStatus.CREATED);
    }
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Factura>> findAll(){
        return new ResponseEntity<>(facturaService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> findById(@PathVariable Integer id){
        return new ResponseEntity<>(facturaService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        facturaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
