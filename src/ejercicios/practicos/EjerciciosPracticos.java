/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.practicos;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ss=new Scanner(System.in);
        operaciones sc=new operaciones();
       
       
        
        String cadena;
        cadena = """
                 Ingrese la opcion: 
                 1 = Sueldo empleado 
                 2 = Area circulo 
                 3 = Total a pagar
                 4 = Divisible por 5
                 5 = Numero factorial
                 6 = Decodificarr
                 7 = Calcular area de un triangulo
                 8 = Crear matriz
                 """;
        System.out.println(cadena);
        int opcion = ss.nextInt();
        switch (opcion) {
            case  1 -> sc.AreaCirculo();             
            case  2 -> sc.TotalPagar();
            case  3 -> sc.SueldoEmpleado();
            case  4 -> sc.divisible5();
            case  5 -> sc.factorial();
            case  6 -> sc.Decodificador();  
            case  7 -> sc.CalcuarAreaTriangulo();
            case  8 -> sc.CrearMatriz();
            
            default -> throw new AssertionError();
        }
    }
    
}
