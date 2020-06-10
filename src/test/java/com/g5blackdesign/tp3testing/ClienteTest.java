/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.Cliente;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Controladores.ControladorCliente;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
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
        static Producto producto1;
        
  
        
   
        /*** Como el carrito 
         * está vacío 
         * no se crea el cliente
         * y el método Crear cliente debe devolver false 
        ***/
        
        @BeforeEach
            void crearObjetosIniciales() {
                
                controladorCliente = new ControladorCliente();
                producto1 = new Producto("PC","i5 con 8 gb",10000f);
                producto1.setId(1);
                listaDetalleCarrito = new ArrayList();
                
                
        }
        
        
        
        
        
        
        @ParameterizedTest
        @CsvSource({"luis,Alvarado,35678392,lafg@mail.com"})
            void CrearClienteConCarroVacío(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                carrito = new Carrito(listaDetalleCarrito);
                carrito.setId(1);
                controladorCliente = new ControladorCliente();
                assertEquals(false,controladorCliente.getExpertoCliente().CrearCliente(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
            
        @ParameterizedTest
        @CsvSource({"S3RG10,Alvarado,35678392,lafg@mail.com"})
            void CrearClienteConNombreconNumeros(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                carrito = new Carrito(listaDetalleCarrito);
                carrito.setId(1);
                DetalleCarrito detalleCarrito = new DetalleCarrito(1,1,3);
                listaDetalleCarrito.add(detalleCarrito);                
                assertEquals(false,controladorCliente.getExpertoCliente().CrearCliente(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
            
        
       
}
