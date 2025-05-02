/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.proyecto.sistemajoseabel.servicios;

import com.proyecto.sistemajoseabel.dao.ProduccionDao;
import com.proyecto.sistemajoseabel.entidades.Produccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduccionService {

    @Autowired
    private ProduccionDao produccionDao;

    public Produccion guardar(Produccion produccion) {
        return produccionDao.guardar(produccion);
    }

    public void eliminar(Integer idProduccion) {
        produccionDao.eliminar(idProduccion);
    }

    public Optional<Produccion> obtenerPorId(Integer idProduccion) {
        return produccionDao.obtenerPorId(idProduccion);
    }

    public List<Produccion> obtenerTodasLasProducciones() {
        return produccionDao.obtenerTodas();
    }
}
