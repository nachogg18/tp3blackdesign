/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.Cliente;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Controladores.ControladorCliente;
import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ignacio
 */
public class ClienteTest {
    
        static Carrito carrito ;
        static Cliente usuario;
        static List<DetalleCarrito> listaDetalleCarrito;
        static ControladorCliente controladorCliente; 
        
  
        
   
        /*** Como el carrito 
         * está vacío 
         * no se crea el cliente
         * y el método Crear cliente debe devolver false 
        ***/
        @ParameterizedTest
        @CsvSource({"luis,Alvarado,35678392,lafg@mail.com"})
            void CrearClienteConCarroVacío(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                listaDetalleCarrito = new ArrayList();  //ESTÁ VACÍO
                carrito = new Carrito(listaDetalleCarrito);
                controladorCliente = new ControladorCliente();
                assertEquals(false,controladorCliente.getExpertoCliente().CrearCliente(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
       
}
