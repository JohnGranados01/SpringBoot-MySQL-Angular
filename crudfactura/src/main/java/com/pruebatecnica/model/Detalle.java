package com.pruebatecnica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="num_detalle")
    private Integer num_detalle;

    @Column(name="id_factura")
    private Integer id_factura;

    @Column(name="id_producto")
    private Integer id_producto;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="precio")
    private Integer precio;

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

    // Get´s and Set´s

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
