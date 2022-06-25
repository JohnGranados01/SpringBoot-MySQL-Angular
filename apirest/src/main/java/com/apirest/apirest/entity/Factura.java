package com.apirest.apirest.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num_factura;
    private Integer id_cliente;
    private Date fecha;

    public Factura(){

    }
    
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
