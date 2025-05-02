/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.dao.EtapaProduccionDao;
import com.proyecto.sistemajoseabel.entidades.EtapaProduccion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Personal
 */
    @Service
public class EtapasService {

    @Autowired
    private EtapaProduccionDao etapaProduccion;

    public EtapaProduccion guardar(EtapaProduccion produccion) {
        return etapaProduccion.guardar(produccion);
    }

    public void eliminar(Integer idEtapaProduccion) {
        etapaProduccion.eliminar(idEtapaProduccion);
    }

    public Optional<EtapaProduccion> obtenerPorId(Integer idEtapaProduccion) {
        return etapaProduccion.obtenerPorId(idEtapaProduccion);
    }

    public List<EtapaProduccion> obtenerTodasLasProducciones() {
        return etapaProduccion.obtenerTodas();
    }
}
