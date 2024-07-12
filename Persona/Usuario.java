/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;
import Persona.Persona;
/**
 *
 * @author Admin
 */
public class Usuario extends Persona {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Constructor de Usuario
    public Usuario(int numero, int edad, int dinero) {
        // Llamada al constructor de la superclase
        super("",edad,0.0,"", dinero);
        this.numero = numero;
    }
    
}