/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.sistemajoseabel.repositorio;


import com.proyecto.sistemajoseabel.entidades.Produccion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Personal
 */
public interface RepositorioProduccion extends JpaRepository<Produccion, Integer> {
    
}
