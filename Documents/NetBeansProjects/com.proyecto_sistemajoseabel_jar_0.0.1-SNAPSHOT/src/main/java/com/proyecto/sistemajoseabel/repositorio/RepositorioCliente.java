/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.sistemajoseabel.repositorio;

import com.proyecto.sistemajoseabel.entidades.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Personal
 */
@Repository
public interface RepositorioCliente extends JpaRepository <Cliente, Integer>{
 
}
