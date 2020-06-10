/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Expertos;

import com.g5blackdesign.tp3testing.Entidades.Cliente;
import com.g5blackdesign.tp3testing.Entidades.Carrito;

/**
 *
 * @author ignacio
 */
public class ExpertoCliente {
    private Cliente usuario;
    public Carrito carrito;
    
    
    public static boolean contieneSoloLetras(String nombre) {
        for (int x = 0; x < nombre.length(); x++) {
            char c = nombre.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    
    
    
    
    public boolean CrearCliente(Carrito carrito, String nombre, String apellido, String dni, String email){
        if (!carrito.getListdetallecarrito().isEmpty() && ExpertoCliente.contieneSoloLetras(nombre)) {
            usuario = new Cliente(carrito,nombre,apellido,dni,email);
            return true;
        }
        return false;
    }
        
    
    
}
