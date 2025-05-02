package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo_electronico")
    private String correo_electronico;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;
  @Column(name = "ñaña")
    private String ñaña;
    @ManyToMany(mappedBy = "proveedores")
    private List<Insumo1> insumos;

    // Constructor vacío
    public Proveedor() {
    }

    // Constructor con parámetros

    public Proveedor(int id, String nombre, String correo_electronico, String telefono, String direccion, String ñaña, List<Insumo1> insumos) {
        this.id = id;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ñaña = ñaña;
        this.insumos = insumos;
    }
   

    // Getters y Setters

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

    public String getÑaña() {
        return ñaña;
    }

    public void setÑaña(String ñaña) {
        this.ñaña = ñaña;
    }

    public List<Insumo1> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo1> insumos) {
        this.insumos = insumos;
    }
  
}
