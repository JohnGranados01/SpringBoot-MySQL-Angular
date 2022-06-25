package com.apirest.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private String nombre;
    private Integer precio;
    private Integer stock;

    
    public Producto(){

    }

    public Integer getId_producto(){
        return id_producto;
    }

    public String getNombre(){
        return nombre;
    }

    public Integer getPrecio(){
        return precio;
    }

    public Integer getStock(){
        return stock;
    }


    public void setId_producto(Integer idP){
        this.id_producto = idP;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

}
