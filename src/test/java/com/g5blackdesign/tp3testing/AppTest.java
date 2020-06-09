package com.g5blackdesign.tp3testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.g5blackdesign.tp3testing.Controladores.ControladorProducto;
import com.g5blackdesign.tp3testing.Entidades.Producto;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AppTest {

    public Producto p1=new Producto("comida", "galletas", 0);
   
    @Test
    public void testNombreNoDebeEstarVacio(){
        assertNotEquals("", p1.getNombre());
    }

    @Test
    public void testPrecioProductoMayorIgualCero() {

        float precioReal = p1.getPrecio();
        assertEquals(true, precioReal>=0);
        
   }
}