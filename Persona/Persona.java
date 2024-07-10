/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Persona {
    
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static int lastId = 0;

    private int id;
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;

    public Persona(String nombre, int edad, double peso, String sexo) {
        this.id = ++lastId;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public static void crearPersona() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();

        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.println("Ingrese edad:");
                edad = sc.nextInt();
                sc.nextLine(); // Consumir el carácter de nueva línea restante
                edadValida = true;
            } catch (Exception e) {
                System.out.println("Edad ingresada inválida. Intente nuevamente.");
                sc.nextLine(); // Consumir el carácter de nueva línea restante
            }
        }

        double peso = 0.0;
        boolean pesoValido = false;
        while (!pesoValido) {
            try {
                System.out.println("Ingrese peso:");
                peso = sc.nextDouble();
                sc.nextLine(); // Consumir el carácter de nueva línea restante
                pesoValido = true;
            } catch (Exception e) {
                System.out.println("Peso ingresado inválido. Intente nuevamente.");
                sc.nextLine(); // Consumir el carácter de nueva línea restante
            }
        }

        System.out.println("Ingrese sexo:");
        String sexo = sc.nextLine();

        Persona nuevaPersona = new Persona(nombre, edad, peso, sexo);
        personas.add(nuevaPersona);

        System.out.println("Persona creada con ID: " + nuevaPersona.getId());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    public static void verPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            System.out.println("Lista de Personas:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }
    public static void eliminarPersona(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingre el Id de la persona que desea elinar: ");
       int idEliminar = sc.nextInt();
       sc.nextLine();
       boolean personaEncontrada = false;
        for (Persona persona : personas) {
            if(persona.getId() == idEliminar){
                personas.remove(persona);
                personaEncontrada = true;
                System.out.println("Persona eliminada correctamente");
                break;
            }
            
        }
        if(!personaEncontrada){
            System.out.println("No se encontro a la personas con ese Id");
        }
       
    }
}