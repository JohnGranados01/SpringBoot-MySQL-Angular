package com.apirest.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num_detalle;
    private Integer id_factura;
    private Integer id_producto;
    private Integer cantidad;
    private Integer precio;

    public Detalle(){

    }
    public Integer getNum_detalle(){
        return num_detalle;
    }

    public Integer getId_factura(){
        return id_factura;
    }

    public Integer getId_producto(){
        return id_producto;
    }
    public Integer getCantidad(){
        return cantidad;
    }

    public Integer getPrecio(){
        return precio;
    }


    public void setNum_detalle(Integer num){
        this.num_detalle = num;
    }

    public void setId_factura(Integer idF){
        this.id_factura = idF;
    }

    public void setId_producto(Integer idP){
        this.id_producto = idP;
    }
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
    public void setPrecio(Integer precio){
        this.precio = precio;
    }
    
}
