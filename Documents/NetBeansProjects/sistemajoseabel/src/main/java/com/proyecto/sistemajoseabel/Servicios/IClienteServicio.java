/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.sistemajoseabel.Servicios;
import com.proyecto.sistemajoseabel.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Personal
 */
public interface IClienteServicio {

    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}

