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
    private int dinero;

    public Persona(String nombre, int edad, double peso, String sexo, int dinero) {
        this.id = ++lastId;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.dinero = dinero;
        
    
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
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
     static {
        // Inicializar algunas personas predeterminadas
        personas.add(new Persona("Juan", 25, 70.5, "Masculino", 1500));
        personas.add(new Persona("Maria", 30, 65.0, "Femenino", 2300));
        personas.add(new Persona("Luis", 20, 80.0, "Masculino", 1200));
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
                sc.nextLine(); 
                edadValida = true;
            } catch (Exception e) {
                System.out.println("Edad ingresada inválida. Intente nuevamente.");
                sc.nextLine();
            }
        }

        double peso = 0.0;
        boolean pesoValido = false;
        while (!pesoValido) {
            try {
                System.out.println("Ingrese peso:");
                peso = sc.nextDouble();
                sc.nextLine(); 
                pesoValido = true;
            } catch (Exception e) {
                System.out.println("Peso ingresado inválido. Intente nuevamente.");
                sc.nextLine();
            }
        }

        System.out.println("Ingrese sexo:");
        
        String sexo = sc.nextLine();
        
        System.out.println("Ingrese cunato dinero tiene");
        int dinero =sc.nextInt();
        
        Persona nuevaPersona = new Persona(nombre, edad, peso, sexo, dinero);
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
                ", sexo=" + sexo + 
                ", dinero= $'" +dinero+ '\'' +
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
    public static Persona BuscarPersonaId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Id de la persona que desea buscar: ");
        int idBuscar = sc.nextInt();
        sc.nextLine();
        
        for(Persona persona : personas){
            if(persona.getId() == idBuscar){
               // personaEncontrada=true;
                System.out.println("La persona con este ID es: "+persona);
                return persona;
            }
            
          
        
        }
          System.out.println("No se encontro a la personas con ese Id");
            return null;
    }
    // aca reutilizamos el metodo BuscarPersonaId, para eliminarla
    public static void eliminarPersona() {
        Persona persona = BuscarPersonaId();
        if (persona != null) {
            personas.remove(persona);
            System.out.println("Persona eliminada correctamente");
        } else {
            System.out.println("No se pudo eliminar la persona porque no se encontró");
        }
    }
    
    public static void agregarDinero(){
        Scanner sc = new Scanner(System.in);
       Persona persona = BuscarPersonaId();
        System.out.println("Cuanto dinero desea extraerle a: "+ persona);
       if (persona != null){
           int ingreso = sc.nextInt();
           persona.dinero= persona.dinero+ingreso;
          persona.getDinero();
           System.out.println(persona.getNombre()+"tine: $"+persona.getDinero());
       }
                
    }
    public static void quitarDinero(){
           Scanner sc = new Scanner(System.in);
       Persona persona = BuscarPersonaId();
        System.out.println("Cuanto dinero desea agregarle a: "+ persona);
       if (persona != null){
           int egreso = sc.nextInt();
        if(egreso<= persona.dinero){  
           
           persona.dinero= persona.dinero-egreso;
          persona.getDinero();
           System.out.println(persona.getNombre()+"tine: $"+persona.getDinero());
           } else{
            System.out.println("No es posible extrae ese monto en la cuenta tiene $"+ persona.dinero);
        }
       }
    }
}