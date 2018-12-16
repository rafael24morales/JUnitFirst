/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haches;

import java.util.HashMap;

/**
 *
 * @author rafaelm
 */
public class Hachma {
    
    public static Object contiene(String llave){
        HashMap hmp = new HashMap();
        hmp.put("llave1", "Algun valor 1");
        hmp.put("llave2", "Algun valor 2");
        hmp.put("llave3", "Algun valor 3");
        return hmp.get(llave);
    }
    
    
}
