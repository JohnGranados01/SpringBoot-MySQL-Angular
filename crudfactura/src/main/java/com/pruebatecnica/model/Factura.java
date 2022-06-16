package com.pruebatecnica.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="num_factura")
    private Integer num_factura;
    
    @Column(name="id_cliente")
    private Integer id_cliente;

    @Column(name="fecha")
    private Date fecha;

    // Get´s and Set´s

    public Integer getNum_factura(){
        return num_factura;
    }

    public Integer getId_cliente(){
        return id_cliente;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setNum_factura(Integer num){
        this.num_factura = num;
    }

    public void setId_cliente(Integer num){
        this.id_cliente = num;
    }

    public void setFecha(Date date){
        this.fecha = date;
    }
}
