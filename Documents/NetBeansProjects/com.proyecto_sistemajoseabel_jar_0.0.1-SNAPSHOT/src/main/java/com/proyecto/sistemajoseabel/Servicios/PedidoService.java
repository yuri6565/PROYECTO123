/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.dao.PedidoDao;
import com.proyecto.sistemajoseabel.entidades.Pedido;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Personal
 */
  @Service
public class PedidoService {
  


    @Autowired
    private PedidoDao pedidoDao;

    public Pedido guardar(Pedido produccion) {
        return pedidoDao.guardar(produccion);
    }

    public void eliminar(Integer idProduccion) {
        pedidoDao.eliminar(idProduccion);
    }

    public Optional<Pedido> obtenerPorId(Integer idProduccion) {
        return pedidoDao.obtenerPorId(idProduccion);
    }

    public List<Pedido> obtenerTodasLasProducciones() {
        return pedidoDao.obtenerTodas();
    }
}

