/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.servicios;

import java.util.Map;

/**
 *
 * @author luis
 */
public class SaludosEnglish implements ISaludos{

    private String name;
    Map<String, String> names
            ;
    public SaludosEnglish() {
    }

    public SaludosEnglish(String name) {
        this.name = name;
    }

    public SaludosEnglish(String name, Map<String, String> names) {
        this.name = name;
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNames(Map<String, String> names) {
        this.names = names;
    }

    public Map<String, String> getNames() {
        return names;
    }
    
    @Override
    public String getSaludo() {
        return "Hello " +getName();
        
    }

    @Override
    public void saludaTodos() {
        
        for (String string : names.keySet()) {
            
            System.out.println("Hello "+names.get(string)+ " "+string);
            
        }
        
    }

    @Override
    public void inicio() {
        System.out.println("Inicializo el bean");
    }

    @Override
    public void eliminar() {
        System.out.println("Destruyo el bean");
    }

    
    
    
}
