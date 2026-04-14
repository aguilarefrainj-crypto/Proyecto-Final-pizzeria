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

    public static Producto[] producto = new Producto[25];
    public static int contador = 0;
    public static Producto[] carrito = new Producto[25];
    public static int contadorCarrito = 0;
    public static int numeroOrden = 1;

    public Pedido() {
        producto[contador++] = new Producto(1, "Napolitana", 5500, Categorias.Pizza);
        producto[contador++] = new Producto(2, "Fresca", 1200, Categorias.Bebida);
        producto[contador++] = new Producto(3, "Pan de ajo", 2000, Categorias.Aconpañamiento);
    }

    /*Opciones de Colaborador*/
    public static void verMenu() {
        /* Esta sirve tanto para colaborador como cliente */
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay nada en el menú.");
            return;
        }
        String informacion = "Tenemos los siguinetes productos disponibles:\n";
        for (int i = 0; i < contador; i++) {
            informacion += producto[i].toString();
            informacion += "\n";
            informacion += "--- --- --- --- ---";
            informacion += "\n";
        }
        JOptionPane.showMessageDialog(null, informacion);
    }

    public static void agregarProductoMenu() {
        if (contador < producto.length) {
            int codigo = contador + 1;
            String titulo = JOptionPane.showInputDialog("Nombre del producto: ");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));

            Categorias categorias[] = Categorias.values();
            int seleccion = JOptionPane.showOptionDialog(null, "Escoja la categoria del producto: ", "Categorias",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
            Categorias categoria = categorias[seleccion];

            producto[contador++] = new Producto(codigo, titulo, precio, categoria);
            JOptionPane.showMessageDialog(null, "Producto Registrado de manera correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad de productos alcanzada");
        }
    }

    public static void editarProductoMenu() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo a modificar"));
        Producto productos = null;

        for (int i = 0; i < contador; i++) {
            if (producto[i].getCodigo() == codigo) {
                productos = producto[i];
                break;
            }
        }
        if (productos != null) {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio del producto seleccionado"));
            productos.setPrecioProducto(precio);
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro ningun produccto");
        }
    }

    public static void borrarProductoMenu() {

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo a buscar"));
        int indice = -1;

        for (int i = 0; i < contador; i++) {
            if (producto[i].getCodigo() == codigo) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "No se encontro el producto");
            return;
        }
        for (int i = indice; i < contador - 1; i++) {
            producto[i] = producto[1];
        }
        producto[contador - 1] = null;
        contador--;

        JOptionPane.showMessageDialog(null, "Se borro el producto con exito");
    }

    /* Opciones del cliente */
    public static void agregarProducto() {
        String informacion = "Productos agregados actualmente:\n";

        if (contadorCarrito == 0) {
            informacion += "No hay nada agregado al pedido.\n";
        } else {
            for (int i = 0; i < contadorCarrito; i++) {
                informacion += carrito[i].toString();
                informacion += "\n";
                informacion += "--- --- --- --- ---";
                informacion += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, informacion);

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos en el menú");
            return;
        }

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto que desea agregar"));
        Producto productos = null;

        for (int i = 0; i < contador; i++) {
            if (producto[i].getCodigo() == codigo) {
                productos = producto[i];
                break;
            }
        }

        if (productos == null) {
            JOptionPane.showMessageDialog(null, "No se encontro el producto");
            return;
        }

        if (contadorCarrito < carrito.length) {
            carrito[contadorCarrito++] = productos;
            JOptionPane.showMessageDialog(null, "Producto agregado al pedido correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas productos al pedido");
        }
    }

    public static void borrarProducto() {
        if (contadorCarrito == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos en el pedido");
            return;
        }

        String informacion = "Productos agregados actualmente:\n";

        for (int i = 0; i < contadorCarrito; i++) {
            informacion += carrito[i].toString();
            informacion += "\n";
            informacion += "--- --- --- --- ---";
            informacion += "\n";
        }

        JOptionPane.showMessageDialog(null, informacion);

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto que desea eliminar del pedido"));
        int indice = -1;

        for (int i = 0; i < contadorCarrito; i++) {
            if (carrito[i].getCodigo() == codigo) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            JOptionPane.showMessageDialog(null, "No se encontro el producto en el pedido");
            return;
        }

        for (int i = indice; i < contadorCarrito - 1; i++) {
            carrito[i] = carrito[i + 1];
        }

        carrito[contadorCarrito - 1] = null;
        contadorCarrito--;

        JOptionPane.showMessageDialog(null, "Producto eliminado del pedido correctamente");
    }

    public static void pagarProducto() {
        if (contadorCarrito == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos en el pedido");
            return;
        }

        String informacion = "Detalle del pedido:\n";
        double total = 0;

        for (int i = 0; i < contadorCarrito; i++) {
            informacion += carrito[i].toString();
            informacion += "\n";
            informacion += "--- --- --- --- ---";
            informacion += "\n";
            total += carrito[i].getPrecioProducto();
        }

        informacion += "Total a pagar: " + total + "\n\n";
        informacion += "¿Desea confirmar el pago?";

        String opcionesConfirmar[] = {"Confirmar", "Volver"};
        int confirmar = JOptionPane.showOptionDialog(null, informacion, "Confirmar pago",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesConfirmar, opcionesConfirmar[0]);

        if (confirmar != 0) {
            JOptionPane.showMessageDialog(null, "Pago cancelado");
            return;
        }

        String opcionesPago[] = {"Efectivo", "Tarjeta"};
        int metodo = JOptionPane.showOptionDialog(null, "Seleccione el metodo de pago", "Metodo de pago",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPago, opcionesPago[0]);

        if (metodo == -1) {
            JOptionPane.showMessageDialog(null, "Pago cancelado");
            return;
        }

        String tipoPago = "";

        if (metodo == 0) {
            tipoPago = "Efectivo";
        } else {
            tipoPago = "Tarjeta";
        }

        String recibo = "********** RECIBO **********\n";
        recibo += "Numero de orden: " + numeroOrden + "\n";
        recibo += "Metodo de pago: " + tipoPago + "\n";
        recibo += "Productos comprados:\n";

        for (int i = 0; i < contadorCarrito; i++) {
            recibo += carrito[i].toString();
            recibo += "\n";
            recibo += "--- --- --- --- ---";
            recibo += "\n";
        }

        recibo += "Total cancelado: " + total;

        JOptionPane.showMessageDialog(null, recibo);

        for (int i = 0; i < contadorCarrito; i++) {
            carrito[i] = null;
        }

        contadorCarrito = 0;
        numeroOrden++;
    }
}
