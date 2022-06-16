package com.pruebatecnica.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Integer id_producto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private Integer precio;

    @Column(name="stock")
    private Integer stock;

    // Get´s and Set´s

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
