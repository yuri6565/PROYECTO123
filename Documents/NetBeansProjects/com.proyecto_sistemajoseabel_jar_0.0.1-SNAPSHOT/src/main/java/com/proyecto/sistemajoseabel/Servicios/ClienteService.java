package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.dao.ClienteDao;
import com.proyecto.sistemajoseabel.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    public Cliente guardar(Cliente cliente) {
        return clienteDao.guardar(cliente);
    }

    public void eliminar(Integer idcliente) {
        clienteDao.eliminar(idcliente);
    }

    public Optional<Cliente> obtenerPorId(Integer idcliente) {
        return clienteDao.obtenerPorId(idcliente);
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteDao.obtenerTodos();
    }
    
    
    
}