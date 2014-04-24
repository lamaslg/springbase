/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.servicios;

import com.luis.model.Persona;
import java.util.List;

/**
 *
 * @author luis
 */
public class SaludosSpanish implements ISaludos{

   private Persona  personilla;

   private List<String> nombres;

    public SaludosSpanish(Persona personilla, List<String> nombres) {
        this.personilla = personilla;
        this.nombres = nombres;
    }
   
   
    public SaludosSpanish() {
    }

    public SaludosSpanish(Persona personilla) {
        this.personilla = personilla;
    }

    public Persona getPersonilla() {
        return personilla;
    }

    public void setPersonilla(Persona personilla) {
        this.personilla = personilla;
    }

    public List<String> getNombres() {
        return nombres;
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }

   
    
    @Override
    public String getSaludo() {
       
        return "Hola "+ getPersonilla().getNombre();
        
    }

    @Override
    public void saludaTodos() {
        
        for (String string : nombres) {
            
            System.out.println("Hola "+string);
        }
        
    }
    
}
