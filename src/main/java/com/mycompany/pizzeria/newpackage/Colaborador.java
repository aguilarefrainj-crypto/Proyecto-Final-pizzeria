/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author efrain
 */
public class Colaborador {
 
    public void permisosColaborador (){
        
        int subOpcion1 =0;
        String adminNombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        do {
            
            String opcionesIniciales [] = {"Salir","Borrar producto","Agregar un producto","Ver menu"};
            subOpcion1 = JOptionPane.showOptionDialog(null,"Hola "+ adminNombre+ " un gusto volver a verte. \n"+"En este portal administrativo vas a encontrar las herramientas ecenciales "+
                                                            "para la administración basica para Pizzería Fidelitas.\n"+
                                                            "Selecciona una opción.",
                "Pizzería Fidelitas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesIniciales,opcionesIniciales[0]);
            
        } while (subOpcion1 != 0);
        
   
    }  
}
