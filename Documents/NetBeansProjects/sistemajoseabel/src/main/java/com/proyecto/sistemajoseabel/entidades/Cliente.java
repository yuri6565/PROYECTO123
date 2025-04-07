/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Personal
 */
@Entity
@Table (name="cliente")
public class Cliente {
    

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column (name="id_cliente")
int id_cliente;
@Column (name="nombre")
String nombre;
@Column (name="apellido")
String apellido;
@Column (name="identificacion")
String identificacion;
@Column (name="numero")
int numero;
@Column (name="telefono")
String direccion;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(int id_cliente, String nombre, String apellido, String identificacion, int numero, String direccion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.numero = numero;
        this.direccion = direccion;
    }

    public Cliente() {
    }



}
