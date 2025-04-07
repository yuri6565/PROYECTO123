/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.sistemajoseabel.Servicios.ServicioUsuario;
import com.proyecto.sistemajoseabel.entidades.Usuario;

/**
 *
 * @author Personal
 */

    @Controller
@RequestMapping("/usuarios")
public class UsuarioControlador {
    


    @Autowired 
    private ServicioUsuario servicio;

  
   
  
    @GetMapping("/")
    public String verLista(Model modelo) {
        List<Usuario> listaUsuario = servicio.ListAll(); 
        modelo.addAttribute("listaUsuario", listaUsuario);
        return "lista_usuario"; 
    }

    
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        return "formulario_usuario"; 
    }

   
    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        servicio.save(usuario);
        return "redirect:/usuarios/";
    }

   
    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable Long id, Model modelo) {
        Usuario usuario = servicio.get(id);
        modelo.addAttribute("usuario", usuario);
        return "formulario_usuario";
    }


    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/usuarios/";
    }
    
}
