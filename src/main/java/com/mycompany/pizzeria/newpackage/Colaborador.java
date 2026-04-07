/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage;

import javax.swing.JOptionPane;
import com.mycompany.pizzeria.newpackage.menu.Pedido;

/**
 *
 * @author efrain
 */
public class Colaborador {
 
    public void permisosColaborador (){
        Pedido gestion = new Pedido();{
            int opcion =0;
            String adminNombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
            do {
            
                String opcionesIniciales [] = {"Ver menu","Agregar un producto","Editar producto","Borrar producto","Salir"};
                opcion = JOptionPane.showOptionDialog(null,"Hola "+ adminNombre+ " un gusto volver a verte. \n"+"En este portal administrativo vas a encontrar las herramientas ecenciales "+
                                                            "para la administración basica para Pizzería Fidelitas.\n"+
                                                            "Selecciona una opción.",
                                                            "Pizzería Fidelitas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesIniciales,opcionesIniciales[0]);
            
                switch(opcion){
                    case 0:
                        gestion.verMenu();
                        break;
                    case 1:
                        gestion.agregarProductoMenu();
                        break;
                    case 2:
                        gestion.editarProductoMenu();
                        break;
                    case 3:
                        gestion.borrarProductoMenu();
                        break;
                }
            
            } while (opcion != 4);
        
   
        }  
    }
}
