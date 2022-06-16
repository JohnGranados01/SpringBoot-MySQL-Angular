package com.pruebatecnica.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.model.Factura;

import Servicio.ServicioFactura;

@RestController
// Permite conectrase a nuestra api Rest
@CrossOrigin(origins = {"*"})
// Indica la ruta de acceso
@RequestMapping("/api")
public class Controlador {

    @Autowired
    private ServicioFactura servicioFactura;

    // Listar
    @GetMapping("/factura")
    public List<Factura> listar(){
        return servicioFactura.findAll();
    }
    
    // Guardar
    @PostMapping("/factura")
    // @RequestBody indica que viene como JSON
    public Factura guardar(@RequestBody Factura factura){
        return servicioFactura.save(factura);

    }

    // Seleccionar un elemento
    @GetMapping("/factura/{id}")
    public Factura getElemento(@PathVariable Integer id){
        return servicioFactura.findById(id);
    }

    // Modificar
    @PutMapping("/factura/{id}")
    public Factura modificar(@RequestBody Factura factura, @PathVariable Integer id){
        Factura facturaActual = servicioFactura.findById(id);
        facturaActual.setNum_factura(factura.getNum_factura());
        facturaActual.setId_cliente(factura.getId_cliente());
        facturaActual.setFecha(factura.getFecha());
        
        return servicioFactura.save(facturaActual);


    }

    // Eliminar
    @DeleteMapping("/factura/{id}")
    public void eliminar(@PathVariable Integer id){
        servicioFactura.delete(id);

    }
}
