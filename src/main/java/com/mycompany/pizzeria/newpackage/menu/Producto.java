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
    private int codigoPizza;
    private int codigoBebida;
    private int codigoAcompañamiento;
    private String nombrePizza;
    private String nombreBebida;
    private String nombreAcompañamiento;
    private double precioProducto;
    private Categorias categoriaProducto;

    public Producto(int codigoPizza, int codigoBebida, int codigoAcompañamiento, String nombrePizza, String nombreBebida, String nombreAcompañamiento, double precioProducto, Categorias categoriaProducto) {
        this.codigoPizza = codigoPizza;
        this.codigoBebida = codigoBebida;
        this.codigoAcompañamiento = codigoAcompañamiento;
        this.nombrePizza = nombrePizza;
        this.nombreBebida = nombreBebida;
        this.nombreAcompañamiento = nombreAcompañamiento;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public int getCodigoPizza() {
        return codigoPizza;
    }

    public void setCodigoPizza(int codigoPizza) {
        this.codigoPizza = codigoPizza;
    }

    public int getCodigoBebida() {
        return codigoBebida;
    }

    public void setCodigoBebida(int codigoBebida) {
        this.codigoBebida = codigoBebida;
    }

    public int getCodigoAcompañamiento() {
        return codigoAcompañamiento;
    }

    public void setCodigoAcompañamiento(int codigoAcompañamiento) {
        this.codigoAcompañamiento = codigoAcompañamiento;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public String getNombreAcompañamiento() {
        return nombreAcompañamiento;
    }

    public void setNombreAcompañamiento(String nombreAcompañamiento) {
        this.nombreAcompañamiento = nombreAcompañamiento;
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
        return "Producto{" + "codigoPizza=" + codigoPizza + ", codigoBebida=" + codigoBebida + ", codigoAcompa\u00f1amiento=" + codigoAcompañamiento + ", nombrePizza=" + nombrePizza + ", nombreBebida=" + nombreBebida + ", nombreAcompa\u00f1amiento=" + nombreAcompañamiento + ", precioProducto=" + precioProducto + ", categoriaProducto=" + categoriaProducto + '}';
    }
    
    
}
