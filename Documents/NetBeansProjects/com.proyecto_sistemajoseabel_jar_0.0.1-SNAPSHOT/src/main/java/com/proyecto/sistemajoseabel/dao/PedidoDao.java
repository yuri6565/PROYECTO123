/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.dao;

import com.proyecto.sistemajoseabel.entidades.Pedido;
import com.proyecto.sistemajoseabel.repositorio.RepositorioPedido;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Personal
 */
@Repository
public class PedidoDao {
    


    @Autowired
    private RepositorioPedido repositorioPedido;

    public Pedido guardar(Pedido pedido) {
        return repositorioPedido.save(pedido);
    }

    public void eliminar(Integer idPedido) {
        repositorioPedido.deleteById(idPedido);
    }

    public Optional<Pedido> obtenerPorId(Integer idPedido) {
        return repositorioPedido.findById(idPedido);
    }

    public List<Pedido> obtenerTodas() {
        return repositorioPedido.findAll();
    }
}

