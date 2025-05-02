/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.dao;

import com.proyecto.sistemajoseabel.entidades.EtapaProduccion;
import com.proyecto.sistemajoseabel.repositorio.RepositorioEtapa;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Personal
 */
   @Repository
public class EtapaProduccionDao {
 


    @Autowired
    private RepositorioEtapa repositorioetapa;

    public EtapaProduccion guardar(EtapaProduccion etapaproduccion) {
        return repositorioetapa.save(etapaproduccion);
    }

    public void eliminar(Integer idEtapaProduccion) {
        repositorioetapa.deleteById(idEtapaProduccion);
    }

    public Optional<EtapaProduccion> obtenerPorId(Integer idEtapaProduccion) {
        return repositorioetapa.findById(idEtapaProduccion);
    }

    public List<EtapaProduccion> obtenerTodas() {
        return repositorioetapa.findAll();
    }
}
