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
@Table (name="produccion")
public class Produccion {
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Id
@Column (name="id")
private int id;
@Column (name="nombre")
private String nombre;



}
