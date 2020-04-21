/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personatest;

import java.util.logging.Level;
import java.util.logging.Logger;
import persona.Persona;
import persona.PersonaException;


/**
 *
 * @author Laura
 */
public class PersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona juan = new Persona();
        try {
            Persona pedro = new Persona(121212);
        } catch (PersonaException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Persona laura = new Persona(36159453,"Laura Tula", 'f');
        } catch (PersonaException ex) {
            Logger.getLogger(PersonaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Todo ok");
    }
    
}
