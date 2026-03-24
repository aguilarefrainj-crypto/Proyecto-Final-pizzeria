/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author jbracam 
 */
public class Cliente {
    
       public void clienteMenu() {

        int opcion = 0;

        do {
            String opciones[] = {"Salir","Pagar", "Borrar un producto","Ver menú", "Agregar producto"};

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción del sistema",
                    "Pizzería Fidelitas - Cliente",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[4]
            );

            switch (opcion) {
                case 4:
                    agregarProducto();
                    break;
                case 3:
                    verMenu();
                    break;
                case 2:
                    borrarProducto();
                    break;
                case 1:
                    pagarProducto();
                    break;
            }

        } while (opcion != 0 && opcion != JOptionPane.CLOSED_OPTION);

        JOptionPane.showMessageDialog(null, "Sesión cerrada. ¡Hasta pronto!", "Pizzería Fidelitas", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarProducto() {
        JOptionPane.showMessageDialog(null, "Función: Agregar producto\n(En desarrollo)", "Agregar producto", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verMenu() {
        JOptionPane.showMessageDialog(null, "Función: Ver menú\n(En desarrollo)", "Ver menú", JOptionPane.INFORMATION_MESSAGE);
    }

    private void borrarProducto() {
        JOptionPane.showMessageDialog(null, "Función: Borrar producto\n(En desarrollo)", "Borrar producto", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void pagarProducto(){
        JOptionPane.showMessageDialog(null, "Funcion: Pagar producto\n(En desarrollo", "Pagar Cuenta", JOptionPane.INFORMATION_MESSAGE);
    }
}
