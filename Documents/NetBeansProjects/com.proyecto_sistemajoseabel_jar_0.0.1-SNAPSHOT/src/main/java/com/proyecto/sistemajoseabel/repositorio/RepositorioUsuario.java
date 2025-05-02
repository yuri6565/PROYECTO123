/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.sistemajoseabel.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.sistemajoseabel.entidades.Usuario;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Personal
 */
@Repository
public interface RepositorioUsuario extends JpaRepository <Usuario, Long>{

 Optional<Usuario> findByUsuarioAndContrasena(String usuario, String contrasena);

Optional<Usuario> findByCorreoElectronico(String CorreoElectronico);


    
}
