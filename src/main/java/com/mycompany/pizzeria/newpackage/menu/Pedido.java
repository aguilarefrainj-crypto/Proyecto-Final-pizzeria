/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage.menu;
import com.mycompany.pizzeria.newpackage.Categoria.Categorias;
import com.mycompany.pizzeria.newpackage.menu.Producto;
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
        if (contador<producto.length){
            int codigo = contador + 1;
            String titulo = JOptionPane.showInputDialog("Nombre del producto: ");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
            
            Categorias categorias [] = Categorias.values();
            int seleccion = JOptionPane.showOptionDialog(null, "Escoja la categoria del producto: ", "Categorias", 
                                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
            Categorias categoria = categorias[seleccion];
            
            producto[contador++] = new Producto(codigo, titulo, precio, categoria);
            JOptionPane.showMessageDialog(null, "Producto Registrado de manera correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de productos alcanzada");
        }
    }
    
    public static void editarProductoMenu(){
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo a modificar"));
        Producto productos = null;
        
        for(int i = 0; i < contador; i++){
            if(producto[i].getCodigo() == codigo){
                productos = producto[i];
                break;
            }
        }
        if(productos!=null){
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio del producto seleccionado"));
            productos.setPrecioProducto(precio);
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro ningun produccto");
        }
    }
    
    public static void borrarProductoMenu(){
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo a buscar"));
        int indice= -1;
        
        for(int  i = 0; i<contador; i++){
            if(producto[i].getCodigo()==codigo){
                indice = i;
                break;
        }
      }
        if(indice ==-1){
            JOptionPane.showMessageDialog(null, "No se encontro el producto");
            return;
        }
        for(int i = indice; i<contador -1;i++){
            producto[i]=producto[1];
        }
        producto[contador -1 ]= null;
        contador--;
        
        JOptionPane.showMessageDialog(null, "Se borro el producto con exito");
    }
    
    
    /* Opciones del cliente */
    
    
}
