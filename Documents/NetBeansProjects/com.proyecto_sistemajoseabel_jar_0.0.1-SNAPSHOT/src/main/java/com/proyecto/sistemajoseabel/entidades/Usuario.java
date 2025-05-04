/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Personal
 */
@Entity
@Table (name="usuario")

public class Usuario {
 
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id

private long id;
@Column(length = 250,unique = true,nullable = false)

private String nombre;
 @Column(nullable = false)

private String apellido;
 @Column(nullable = false)

private String usuario;
 @Column(nullable = false)

private String contrasena;
 @Column(nullable = false)
private String correoElectronico;;
 @Column(nullable = false)

private String rol;
  
@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
private List<Asignada> asignaciones;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Asignada> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignada> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public Usuario(long id, String nombre, String apellido, String usuario, String contrasena, String correoElectronico, String rol, List<Asignada> asignaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
        this.rol = rol;
        this.asignaciones = asignaciones;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrasena=" + contrasena + ", correoElectronico=" + correoElectronico + ", rol=" + rol + ", asignaciones=" + asignaciones + '}';
    }




  

  
}
