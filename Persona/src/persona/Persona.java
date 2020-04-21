/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Calendar;

/**
 *
 * @author Laura
 */
public class Persona {
    
    //definimos atributos
    private int dni;
    private String apYNom;
    private Character sexo;
    
    //To Do: Work with this in the future.
    //Calendar fechaNac;
    
    //constructor publico con el nombre de la clase
    public Persona() {
    }
    
    public Persona(int unDni) throws PersonaException {
    setDni(unDni);
    }
    
    public Persona(int dni, String apYNom, Character sexo) throws PersonaException {
    setDni(dni);
    setApYNom(apYNom);
    setSexo(sexo);
    }

    public int getDni() {
        return dni;
    }

    public final void setDni(Integer dni) throws PersonaException {
        if(dni==null || dni<=0) { 
            //ERROR
            throw new PersonaException("Error al setear DNI (no se admiten valores nulos o negativos)");
        }
        this.dni = dni;
    }

    public String getApYNom() {
        return apYNom;
    }

    public final void setApYNom(String apYNom) throws PersonaException {
        if(apYNom == null || apYNom.trim().isEmpty()) { // el trim 'podamos' los espacios adelante y atras
            //ERROR
            throw new PersonaException("Error al setear DNI (no se admiten valores nulos o solo espacios)");
        }
        this.apYNom = apYNom.trim();
    }

    public Character getSexo() {
        return sexo;
    }

    public final void setSexo(Character sexo) throws PersonaException {
        Character sexoLower = Character.toLowerCase(sexo);
        if(!(sexoLower.equals('f') || sexoLower.equals('m'))) { 
            //ERROR
            throw new PersonaException("Error al setear Sexo, tiene que ser f o m");
        }
        this.sexo = sexoLower;
    }
    
    
    
}
