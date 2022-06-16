package com.pruebatecnica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name="id_cliente")
    private Integer id_cliente;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="direccion")
    private String direccion;

    @Column(name="fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name="telefono")
    private Integer telefono;

    @Column(name="email")
    private String email;

    // Get´s and Set´s
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

    // Get´s and Set´s

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
