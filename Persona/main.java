/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;
import Persona.Persona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Persona persona = null;

        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Persona");
            System.out.println("2. Ver Persona");
            System.out.println("3. Eliminar persona por ID");
            
            System.out.println("4. Salir");
            int option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1 ->  Persona.crearPersona(); 
                case 2 -> {
                    Persona.verPersonas();
                }
                case 3 ->{
                    Persona.eliminarPersona();
                }
                case 4 -> exit = true;
                default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
            
        }
    }
}