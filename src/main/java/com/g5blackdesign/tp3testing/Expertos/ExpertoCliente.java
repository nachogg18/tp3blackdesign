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
    
    
    public boolean CrearCliente(Carrito carrito, String nombre, String apellido, String dni, String email){
        if (!carrito.getListdetallecarrito().isEmpty()) {
            usuario = new Cliente(carrito,nombre,apellido,dni,email);
            return true;
        }
        return false;
    }
        
    
    
}
