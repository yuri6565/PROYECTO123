/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Personal
 */


@Entity
@Table(name = "asignada")
public class Asignada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAsignar;  // Puedes usar un ID propio, aunque no esté en el modelo, o definir una clave compuesta si prefieres

    @ManyToOne
    @JoinColumn(name = "etapa_produccion_idetapa_produccion")
    private EtapaProduccion etapaProduccion;

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private Usuario usuario;

    public Integer getIdAsignar() {
        return idAsignar;
    }

    public void setIdAsignar(Integer idAsignar) {
        this.idAsignar = idAsignar;
    }

    public EtapaProduccion getEtapaProduccion() {
        return etapaProduccion;
    }

    public void setEtapaProduccion(EtapaProduccion etapaProduccion) {
        this.etapaProduccion = etapaProduccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Asignada(Integer idAsignar, EtapaProduccion etapaProduccion, Usuario usuario) {
        this.idAsignar = idAsignar;
        this.etapaProduccion = etapaProduccion;
        this.usuario = usuario;
    }

    public Asignada() {
    }

    

   
}
