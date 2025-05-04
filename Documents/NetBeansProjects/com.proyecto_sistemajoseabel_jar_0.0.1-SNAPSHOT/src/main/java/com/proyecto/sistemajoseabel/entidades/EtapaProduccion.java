/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;
import jakarta.persistence.*;
import java.util.List;

import java.time.LocalDate;
/**
 *
 * @author Personal
 */
@Entity
@Table(name = "etapa_produccion")
public class EtapaProduccion {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtapaProduccion;
@Column(length = 250,unique = true,nullable = false)
    private String nombreEtapa;
 @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoEtapa estado;
 @Column(nullable = false)
    private LocalDate fechaInicio;
 @Column(nullable = false)
    private LocalDate fechaFin;

    @ManyToOne
@JoinColumn(name = "id_produccion") // Asegúrate que la columna exista en la BD
private Produccion produccion;
    public Integer getIdEtapaProduccion() {
        return idEtapaProduccion;
    }
    
    
    @OneToMany(mappedBy = "etapaProduccion", cascade = CascadeType.ALL)
private List<Asignada> asignaciones;

    public String getNombreEtapa() {
        return nombreEtapa;
    }

    public void setNombreEtapa(String nombreEtapa) {
        this.nombreEtapa = nombreEtapa;
    }

    public EstadoEtapa getEstado() {
        return estado;
    }

    public void setEstado(EstadoEtapa estado) {
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

    public Produccion getProduccion() {
        return produccion;
    }

    public void setProduccion(Produccion produccion) {
        this.produccion = produccion;
    }

    public List<Asignada> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignada> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public EtapaProduccion(Integer idEtapaProduccion, String nombreEtapa, EstadoEtapa estado, LocalDate fechaInicio, LocalDate fechaFin, Produccion produccion, List<Asignada> asignaciones) {
        this.idEtapaProduccion = idEtapaProduccion;
        this.nombreEtapa = nombreEtapa;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.produccion = produccion;
        this.asignaciones = asignaciones;
    }

    public EtapaProduccion() {
    }





}




  
