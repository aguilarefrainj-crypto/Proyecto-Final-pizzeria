/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage.menu;
import com.mycompany.pizzeria.newpackage.Categoria.Categorias;
/**
 *
 * @author efran
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precioProducto;
    private Categorias categoriaProducto;

    public Producto(int codigo, String nombre, double precioProducto, Categorias categoriaProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Categorias getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Categorias categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precioProducto=" + precioProducto + ", categoriaProducto=" + categoriaProducto + '}';
    }
    
    
}    