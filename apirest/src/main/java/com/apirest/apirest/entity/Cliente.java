package com.apirest.apirest.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    private Integer id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fecha_nacimiento;
    private Integer telefono;
    private String email;

    public Cliente(){

    }
    public Integer getId_cliente(){
        return id_cliente;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDireccion(){
        return direccion;
    }

    public Date getfecha_nacimiento(){
        return fecha_nacimiento;
    }

    public Integer getTelefono(){
        return telefono;
    }

    public String getEmail(){
        return email;
    }

    public void setId_cliente(Integer idC){
        this.id_cliente = idC;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setFNacimiento(Date fecha){
        this.fecha_nacimiento = fecha;
    }

    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }

    public void setEmail(String correo){
        this.email = correo;
    }
}
