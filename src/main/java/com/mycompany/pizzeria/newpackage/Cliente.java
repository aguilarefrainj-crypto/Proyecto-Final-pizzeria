/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria.newpackage;

import javax.swing.JOptionPane;
import com.mycompany.pizzeria.newpackage.menu.Pedido;

/**
 *
 * @author jbracam
 */
public class Cliente {

    public void clienteMenu() {
        Pedido gestion = new Pedido();
        {

            int opcion = 0;

            do {
                String opciones[] = {"Ver menú","Agregar producto","Borrar un producto","Pagar","Salir"};

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
                    case 0:
                        gestion.verMenu();
                        break;
                    case 1:
                        gestion.agregarProducto();
                        break;
                    case 2:
                        gestion.borrarProducto();
                        break;
                    case 3:
                        gestion.pagarProducto();
                        break;
                }

            } while (opcion != 4 && opcion != JOptionPane.CLOSED_OPTION);

            JOptionPane.showMessageDialog(null, "Sesión cerrada. ¡Hasta pronto!", "Pizzería Fidelitas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
