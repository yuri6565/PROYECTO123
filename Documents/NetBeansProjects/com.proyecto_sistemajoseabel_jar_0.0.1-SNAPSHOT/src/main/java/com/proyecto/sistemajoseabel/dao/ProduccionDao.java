/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.dao;


import com.proyecto.sistemajoseabel.entidades.Produccion;
import com.proyecto.sistemajoseabel.repositorio.RepositorioProduccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProduccionDao {

    @Autowired
    private RepositorioProduccion repositorioProduccion;

    public Produccion guardar(Produccion produccion) {
        return repositorioProduccion.save(produccion);
    }

    public void eliminar(Integer idProduccion) {
        repositorioProduccion.deleteById(idProduccion);
    }

    public Optional<Produccion> obtenerPorId(Integer idProduccion) {
        return repositorioProduccion.findById(idProduccion);
    }

    public List<Produccion> obtenerTodas() {
        return repositorioProduccion.findAll();
    }
}
