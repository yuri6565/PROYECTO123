/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.dao;

import com.proyecto.sistemajoseabel.entidades.Usuario;
import com.proyecto.sistemajoseabel.repositorio.RepositorioUsuario;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Personal
 */
@Repository
public class UsuarioDao {
 
    @Autowired
    private RepositorioUsuario usuarioRepositorio;

    public Optional<Usuario> autenticarUsuario(String usuario, String contrasena) {
        return usuarioRepositorio.findByUsuarioAndContrasena(usuario, contrasena); 
        
}
     public Optional<Usuario> verificarCorreo(String correoElectronico) {
        return usuarioRepositorio.findByCorreoElectronico(correoElectronico);

        
} 
}
