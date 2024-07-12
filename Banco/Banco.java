/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;
import java.util.Scanner;
import Persona.Persona;
/**
 *
 * @author Admin
 */
public class Banco {
    
    private String titular;
    private int numeroCuenta;
    
    private static int lastNumeroCuenta = 0;
    private static ArrayList<Banco> titulares = new ArrayList<>();
     
    public static ArrayList<Banco> getBanco() {
        return titulares;
    }
 
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

   
   public Banco(String titular) {
        this.titular = titular;
        this.numeroCuenta = ++lastNumeroCuenta;
      
    
        
       
    
    }

   
   public static void registrarUsuario(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el Id de la persona a registrar");
        String titular = sc.nextLine();
       Banco nuevoTitular = new Banco(titular);
        titulares.add(nuevoTitular);

        System.out.println("Titular creado con Numero de cuenta: " + nuevoTitular.getNumeroCuenta());
       
       
   }
    @Override
    public String toString() {
        return "Banco{" + "titular=" + titular + ", numeroCuenta=" + numeroCuenta + '}';
    }
}
