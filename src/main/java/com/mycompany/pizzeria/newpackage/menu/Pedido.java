/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage.menu;
import com.mycompany.pizzeria.newpackage.Categoria.Categorias;
import javax.swing.JOptionPane;
/**
 *
 * @author efran
 */
public class Pedido {
    
    public static Producto [] producto = new Producto [25];
    public static int contador = 0;
    
    public Pedido(){
        producto[contador++] = new Producto(1, "Napolitana", 5500, Categorias.Pizza);
        producto[contador++] = new Producto(2, "Fresca", 1200, Categorias.Bebida);
        producto[contador++] = new Producto(3, "Pan de ajo", 2000, Categorias.Aconpañamiento);
    }
    
    /*Opciones de Colaborador*/
    public static void verMenu(){    /* Esta sirve tanto para colaborador como cliente */
        if (contador ==0){
            JOptionPane.showMessageDialog(null, "No hay nada en el menú.");
            return;
        }
        String informacion = "Tenemos los siguinetes productos disponibles:\n";
        for(int i = 0 ; i<contador; i++){
            informacion += producto[i].toString();
            informacion += "\n";
            informacion += "--- --- --- --- ---";
            informacion += "\n";
        }
        JOptionPane.showMessageDialog(null, informacion);
    }
    
    public static void agregarProductoMenu(){
        
    }
    
    public static void editarProductoMenu(){
        
    }
    
    public static void borrarProductoMenu(){
        
    }
    
    
    /* Opciones del cliente */
    
    
}
