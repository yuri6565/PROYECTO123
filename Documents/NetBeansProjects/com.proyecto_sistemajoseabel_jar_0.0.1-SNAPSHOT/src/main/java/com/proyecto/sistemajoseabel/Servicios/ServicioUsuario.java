/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.dao.UsuarioDao;
import com.proyecto.sistemajoseabel.entidades.Usuario;
import com.proyecto.sistemajoseabel.repositorio.RepositorioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Personal
 */
 @Service
public class ServicioUsuario {
   
    
   @Autowired
    private UsuarioDao clienteDao;

    public Usuario guardar(Usuario usuario) {
        return clienteDao.guardar(usuario);
    }

    public void eliminar(Long id) {
        clienteDao.eliminar(id);
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return clienteDao.obtenerPorId(id);
    }

    public List<Usuario> obtenerTodosLosClientes() {
        return clienteDao.obtenerTodos();
    }
}


