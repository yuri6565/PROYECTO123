/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Personal
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Usuario1 {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUsuario;
    String nombre;
    String apellido;
    String usuario;
    String contrasena;
    String correo_electronico;
    String rol;
    
}
