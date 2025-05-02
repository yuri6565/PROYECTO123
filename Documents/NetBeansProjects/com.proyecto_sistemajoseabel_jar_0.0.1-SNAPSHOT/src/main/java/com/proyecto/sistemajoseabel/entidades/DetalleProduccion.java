/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;
 import jakarta.persistence.*;
/**
 *
 * @author Personal
 */

   


@Entity
@Table(name = "detalle_produccion")
public class DetalleProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleProduccion;

    private Integer cantidad;

    private String dimensiones;

    @ManyToOne
@JoinColumn(name = "id_produccion") // Asegúrate que la columna exista en la BD
private Produccion produccion;

    public Integer getIdDetalleProduccion() {
        return idDetalleProduccion;
    }

    public void setIdDetalleProduccion(Integer idDetalleProduccion) {
        this.idDetalleProduccion = idDetalleProduccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Produccion getProduccion() {
        return produccion;
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    public DetalleProduccion(Integer idDetalleProduccion, Integer cantidad, String dimensiones, Produccion produccion) {
        this.idDetalleProduccion = idDetalleProduccion;
        this.cantidad = cantidad;
        this.dimensiones = dimensiones;
        this.produccion = produccion;
    }

    public DetalleProduccion() {
    }

    
}

