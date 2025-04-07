/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.entidades.Usuario;
import com.proyecto.sistemajoseabel.repositorio.RepositorioUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Personal
 */
 @Service
public class ServicioUsuario {
   
    
    @Autowired
    private RepositorioUsuario usuarioRepositorio;

    public List<Usuario> ListAll(){
        return usuarioRepositorio.findAll();
    }

    public void save(Usuario usuario){
        usuarioRepositorio.save(usuario);
    }

    public Usuario get(Long id){
        return usuarioRepositorio.findById(id).get();
    }

    public void delete(Long id){
        usuarioRepositorio.deleteById(Long.MIN_VALUE);
    }
}


