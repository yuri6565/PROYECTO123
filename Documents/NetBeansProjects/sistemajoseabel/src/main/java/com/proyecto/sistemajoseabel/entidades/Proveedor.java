/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Personal
 */
@Entity
@Table (name="proveedor")

public class Proveedor {
 @Id  
@Column (name="id") 
 private int id;
@Column (name = "nombre")
private String nombre;
@Column (name="correo_electronico")
private String correo_electronico;
@Column (name="telefono")
private String telefono; 
@Column (name="direccion")
private String direccion; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Proveedor(int id, String nombre, String correo_electronico, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Proveedor() {
    }




}
