/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing;
//import com.g5blackdesign.tp3testing.Controladores.ControladorCarrito;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.Usuario;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Controladores.ControladorUsuario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
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
public class UsuarioTest {
    
        static Carrito carrito ;
        static Usuario usuario;
        static List<DetalleCarrito> listaDetalleCarrito;
        static ControladorUsuario controladorUsuario; 
        
        
        @BeforeAll
        public static void CrearObjetosNecesarios() {
            listaDetalleCarrito = new ArrayList();
            carrito = new Carrito(listaDetalleCarrito);
            controladorUsuario = new ControladorUsuario();
        }
        
   
    
        @ParameterizedTest
        @CsvSource({"Ignacio,Galvez,35678392,lafg@mail.com"})
            void CrearUsuarioConCarroVacío(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                assertEquals(false,controladorUsuario.getExpertoUsuario().CrearUsuario(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
            
            
    
    
}
