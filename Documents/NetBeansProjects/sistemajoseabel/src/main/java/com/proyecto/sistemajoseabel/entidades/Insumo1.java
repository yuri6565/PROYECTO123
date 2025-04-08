/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.sistemajoseabel.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;

/**
 *
 * @author Personal
 */
    @Entity
public class Insumo1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventario;

    @Lob
    private byte[] imagen;

    private String nombre;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private TipoInsumo tipo;

    @Enumerated(EnumType.STRING)
    private EstadoInsumo estado;

    @Enumerated(EnumType.STRING)
    private TipoStock stock;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "unidad_medida_idunidad_medida")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "marca_idmarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "categoria_categoria_insumo")
    private Categoria categoria;

    
   
    @ManyToMany
@JoinTable(
    name = "insumo_proveedor",
    joinColumns = @JoinColumn(name = "insumo_id", referencedColumnName = "idInventario"),
    inverseJoinColumns = @JoinColumn(name = "proveedor_id", referencedColumnName = "id")
)
private List<Proveedor> proveedores;

    
    public enum TipoInsumo {
        MATERIA_PRIMA, HERRAMIENTA
    }

    public enum EstadoInsumo {
        DISPONIBLE, AGOTADO, DAÑADO
    }

    public enum TipoStock {
        ALTO, MEDIO, BAJO
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoInsumo getTipo() {
        return tipo;
    }

    public void setTipo(TipoInsumo tipo) {
        this.tipo = tipo;
    }

    public EstadoInsumo getEstado() {
        return estado;
    }

    public void setEstado(EstadoInsumo estado) {
        this.estado = estado;
    }

    public TipoStock getStock() {
        return stock;
    }

    public void setStock(TipoStock stock) {
        this.stock = stock;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Insumo1(Integer idInventario, byte[] imagen, String nombre, String descripcion, TipoInsumo tipo, EstadoInsumo estado, TipoStock stock, Integer cantidad, UnidadMedida unidadMedida, Marca marca, Categoria categoria, List<Proveedor> proveedores) {
        this.idInventario = idInventario;
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estado = estado;
        this.stock = stock;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.marca = marca;
        this.categoria = categoria;
        this.proveedores = proveedores;
    }

    public Insumo1() {
    }

  

  
    
    
    

    
    
}

    

