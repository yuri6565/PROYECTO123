/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;



import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;




  



@Entity
@Table(name = "produccion")
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduccion;
private String nombre;
    @Column(columnDefinition = "DATE")
    private LocalDate fechaInicio;

    @Column(columnDefinition = "DATE")
    private LocalDate fechaFin;

    @Enumerated(EnumType.STRING)
    private EstadoProduccion estado;

    @ManyToOne
    @JoinColumn(name = "pedido_codigo")
    private Pedido pedido;

    @OneToMany(mappedBy = "produccion", cascade = CascadeType.ALL)
    private List<EtapaProduccion> etapas;

    @OneToMany(mappedBy = "produccion", cascade = CascadeType.ALL)
    private List<DetalleProduccion> detalles;

    public Integer getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Integer idProduccion) {
        this.idProduccion = idProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public EstadoProduccion getEstado() {
        return estado;
    }

    public void setEstado(EstadoProduccion estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<EtapaProduccion> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<EtapaProduccion> etapas) {
        this.etapas = etapas;
    }

    public List<DetalleProduccion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleProduccion> detalles) {
        this.detalles = detalles;
    }

    public Produccion(Integer idProduccion, String nombre, LocalDate fechaInicio, LocalDate fechaFin, EstadoProduccion estado, Pedido pedido, List<EtapaProduccion> etapas, List<DetalleProduccion> detalles) {
        this.idProduccion = idProduccion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.pedido = pedido;
        this.etapas = etapas;
        this.detalles = detalles;
    }

    public Produccion() {
    }

 

}

