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
        int contraCliente = 123;
        String colaborador = "admin";
        int contraAdmin = 456;

        String opcionesIniciales[] = {"Iniciar sesión", "Salir"};
        opcion = JOptionPane.showOptionDialog(null, "Desea iniciar sesion o salir?",
                "Pizzería Fidelitas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesIniciales, opcionesIniciales[0]);

        do {
            if (opcion == 0) {

                String usuario = "";
                do {
                    usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Pizzería Fidelitas", JOptionPane.DEFAULT_OPTION);

                    if (usuario == null) {
                        break;
                    }

                    if (usuario.equals("")) {
                        JOptionPane.showMessageDialog(null, "El usuario no puede estar vacío, inténtelo de nuevo");
                    }

                } while (usuario.equals(""));

                if (usuario == null) {
                    break;
                }

                String contraseña = "";
                boolean esNumero = false;

                do {
                    contraseña = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Pizzería Fidelitas", JOptionPane.DEFAULT_OPTION);

                    if (contraseña == null) {
                        break;
                    }

                    if (contraseña.equals("")) {
                        JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía, inténtelo de nuevo");
                    } else {
                        esNumero = true;

                        for (int i = 0; i < contraseña.length(); i++) {
                            if (Character.isLetter(contraseña.charAt(i))) {
                                esNumero = false;
                            }
                        }

                        if (esNumero == false) {
                            JOptionPane.showMessageDialog(null, "La contraseña no puede tener letras, inténtelo de nuevo");
                        }
                    }

                } while (contraseña.equals("") || esNumero == false);

                if (contraseña == null) {
                    break;
                }

                int contraseñaNumero = Integer.parseInt(contraseña);

                if (usuario.equalsIgnoreCase(cliente) && contraseñaNumero == contraCliente) {

                    comprador.clienteMenu();

                } else if (usuario.equalsIgnoreCase(colaborador) && contraseñaNumero == contraAdmin) {

                    gestor.permisosColaborador();

                } else {
                    JOptionPane.showMessageDialog(null, "No tiene acceso, por seguridad el sistema se va a cerrar",
                            "Pizzería Fidelitas", JOptionPane.DEFAULT_OPTION);
                    break;
                }
            } else {
                break;
            }
        } while (opcion != 1);
    }
}