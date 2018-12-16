/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testeo;

import com.haches.Hachma;
import com.pares.Pares;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafaelm
 */
public class Testeo {
    
    public Testeo() {
    }
    
    ///AssertTrue
    @Test
    public void testIsPar1(){
        int numero = 16;
        assertTrue(Pares.isPar(numero));
    }
    
    //AssertFalse
     @Test
    public void testIsPar2(){
        int numero = 17;
        assertFalse(Pares.isPar(numero));
    }
    
    //AssertNull
    @Test
    public void testContiene1(){
        assertNull(Hachma.contiene("llave4"));
    }
    
     //AssertNull
    @Test
    public void testContiene2(){
        assertNotNull(Hachma.contiene("llave3"));
    }
    
    //AssertNotSame
    @Test
    public void testIgual1(){
        Ballena va_llena1 = new Ballena("MobiDick");
        Ballena va_llena2 = new Ballena("MobiDick");
        assertNotSame( va_llena1, va_llena2);
    }
    
     @Test
    public void testIgual3(){
        Ballena va_llena1 = new Ballena("MobiDick");
        Ballena va_llena2 = va_llena1;
         va_llena1.setNombre("OtroNobre");
        assertSame( va_llena1, va_llena2);
    }
    
    
     //AssertEquals
    @Test
    public void testIgual2(){
        Ballena va_llena1 = new Ballena("MobiDick");
        Ballena va_llena2 = va_llena1;
        va_llena1.setNombre("OtroNobre");
        va_llena2 = new Ballena("MobiDick");
        assertEquals( va_llena1, va_llena2);
    }
    
    
    
    
}
