/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;
import jakarta.persistence.*;
import java.time.LocalDate;
/**
 *
 * @author Personal
 */




@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

@Column(length = 250,unique = true,nullable = false)
    private String nombre;
 @Column(nullable = false)
    private Double precioTotal;
 @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoPedido estado;
 @Column(nullable = false)
    private LocalDate fechaInicio;
 @Column(nullable = false)
    private LocalDate fechaFin;
 
    @ManyToOne
@JoinColumn(name = "cliente_codigo", referencedColumnName = "idcliente")
private Cliente cliente;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(Integer idPedido, String nombre, Double precioTotal, EstadoPedido estado, LocalDate fechaInicio, LocalDate fechaFin, Cliente cliente) {
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
    }

    public Pedido() {
    }

@Override
public String toString() {
    return nombre;
}

 
  
}
