/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.repositorio.RepositorioCliente;
import java.util.List;
import com.proyecto.sistemajoseabel.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Personal
 */
@Service
public class ServicioCliente implements IClienteServicio  {
    
      @Autowired
    private RepositorioCliente clienteRepositorio;

      @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }


}

