/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizzeria;

import com.mycompany.pizzeria.newpackage.Colaborador;
import com.mycompany.pizzeria.newpackage.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author efrain
 */
public class Pizzeria {

    public static void main(String[] args) {
        Cliente comprador = new Cliente();
        Colaborador gestor = new Colaborador();
       
        int opcion = 0;
        String cliente = "cliente";
        int contraCliente= 123;
        String colaborador = "admin";
        int contraAdmin = 456;

        String opcionesIniciales [] = {"Salir","Iniciar sesión"};
        opcion = JOptionPane.showOptionDialog(null,"Desea iniciar sesion o salir?", 
                "Pizzería Fidelitas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesIniciales,opcionesIniciales[0]);
        
        
        
            do {
                if(opcion == 1){
                
                    String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Pizzeria-JAVA",JOptionPane.DEFAULT_OPTION);
                    int contraseña = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Pizzería Fidelitas",JOptionPane.DEFAULT_OPTION));

                    if (usuario.equalsIgnoreCase(cliente) && contraseña == contraCliente ) {

                        comprador.clienteMenu();

                    } else if(usuario.equalsIgnoreCase(colaborador)&&contraseña == contraAdmin) {
                        
                                gestor.permisosColaborador();

                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene acceso");
                    }
                    
                }  
            } while(opcion !=0);      
    }
}
