/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;

import com.proyecto.sistemajoseabel.dao.UsuarioDao;
import com.proyecto.sistemajoseabel.entidades.Usuario;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServicioLogin {
     
 
     @Autowired
    private UsuarioDao usuarioDao;

    public boolean autenticar(String usuario, String contrasena) {
        Optional<Usuario> usuarioEncontrado = usuarioDao.autenticarUsuario(usuario, contrasena);
        return usuarioEncontrado.isPresent();
    }
}




