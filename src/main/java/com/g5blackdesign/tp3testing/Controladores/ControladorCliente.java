/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Controladores;

import com.g5blackdesign.tp3testing.Entidades.Cliente;
import com.g5blackdesign.tp3testing.Expertos.ExpertoCliente;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
/**
 *
 * @author federico
 */
public class ControladorCliente {
    
    public ExpertoCliente expertoCliente = new ExpertoCliente();
    
    public void CrearCliente(Carrito carrito,String nombre,String apellido,String dni,String email){
        expertoCliente.CrearCliente(carrito,nombre, apellido, dni, email);
    }
    
    public ExpertoCliente getExpertoCliente() {
        return expertoCliente;
    }
    
}


