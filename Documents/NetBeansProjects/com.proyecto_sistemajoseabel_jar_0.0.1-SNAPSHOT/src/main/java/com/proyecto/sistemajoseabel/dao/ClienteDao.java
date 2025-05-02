package com.proyecto.sistemajoseabel.dao;

import com.proyecto.sistemajoseabel.entidades.Cliente;
import com.proyecto.sistemajoseabel.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteDao {

    @Autowired
    private RepositorioCliente clienteRepository;

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminar(Integer idcliente) {
        clienteRepository.deleteById(idcliente);
    }

    public Optional<Cliente> obtenerPorId(Integer idcliente) {
        return clienteRepository.findById(idcliente);
    }

    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }
}