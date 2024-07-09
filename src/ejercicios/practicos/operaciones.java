/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.practicos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class operaciones {
     Scanner sc = new Scanner(System.in);
    public void AreaCirculo(){
        System.out.println("Ingrese el radio del circulo");
       // Scanner sc = new Scanner(System.in);
        
        double radio=sc.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
       // double area=num*Radiocuadrado;
        System.out.println("El area del circulo es "+ area+"cm*2 ");
    }
    
    public void TotalPagar(){
        double PkiloMenor10 = 20.50;
        double PkiloMayor10 = 18;
       // Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de su paquete");
        double peso=sc.nextDouble();
        if (peso<10){
            System.out.println("El precio a pagar por el envio es de $20.50 por kilo, usted tine que abonar: $"+peso*PkiloMenor10);
            
        }else{
            System.out.println("El precio a pagar por el envio es de $18 por kilo, usted tine que abonar: $"+peso*PkiloMayor10);
        }
        
    }
    public void SueldoEmpleado(){
        System.out.println("Ingrese el sueldoo");
       // Scanner sc = new Scanner(System.in);
        int sueldo=sc.nextInt();
        if(sueldo>=1500 && sueldo<=2000){
            System.out.println("Usted recibe un bono de 30%: $"+sueldo*0.3+" Total a cobrar: $"+ sueldo*1.3);
        }else if(sueldo>=2001 && sueldo<=3000){
             System.out.println("Usted recibe un bono de 25%: $"+sueldo*0.25+" Total a cobrar: $"+ sueldo*1.25);
            
        }else if(sueldo>=3001 && sueldo<=5000){
             System.out.println("Usted recibe un bono de 20%: $"+sueldo*0.2+" Total a cobrar: $"+ sueldo*1.2);
          
        }else if(sueldo>=5001 && sueldo<=8000){
             System.out.println("Usted recibe un bono de 15%: $"+sueldo*0.15+" Total a cobrar: $"+ sueldo*1.15);
             
        }else if(sueldo>8000){
             System.out.println("Usted recibe un bono de 10%: $"+sueldo*0.1+" Total a cobrar: $"+ sueldo*1.1);
          
        }else{
            System.out.println("Usted no ingreso un sueldo real");   
        }
                
    }
    public void divisible5(){
        System.out.println("ingrese 3 numeros");
       // Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 3; i++) {
             int num = sc.nextInt();
            if (num % 5 == 0) {
                System.out.println("El numero:"+ num+" es divisible por 5");
                
            }else{
                System.out.println("El numero:"+ num+" no es divisible por 5");
            }
        }
    }
    public void factorial(){
       // Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int factorial=1;
        System.out.println("Ingrese un numero para calcular su factorial");
        while (num !=0) {
        
            factorial =factorial*num;
            num--;
        }
      
        
         System.out.println("El numero ingresado fue: "+num+" Su factorial es: "+factorial);
    }
    public void Decodificador(){
                
        char[] mapaNumeros = {'D', 'W', 'E', 'L', 'H', 'O', 'R'};
        StringBuilder String1= new StringBuilder();
       // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            
           System.out.println( "Ingrese un numero del 1 al 7 "+ i );
             int num = sc.nextInt();
            System.out.println("Numero ingresado: "+ num);
            if (num<1 || num>7) {
                i = i-1;
                System.out.println("Ingrese otro numero; "+num+" no se encuentra entre 1 y 7 ");
            }else{
                
                char letra = mapaNumeros[num - 1];
                 String1.append(letra);
            System.out.println(String1+"cadena");
             System.out.println("Cadena decodificada: " + String1.toString());
            }
           
        }
    }
    public void CalcuarAreaTriangulo(){
      
       
       // Scanner sc = new Scanner(System.in);
      
        System.out.println("""
                           Si conoce la base y la altura responda: 1;
                           Si conoce la 2 lados y su angulo responda: 2
                           Si no conoce la base y la altura responda: 3;
                           """);
        for (int i = 0; i < 1; i++) {
            
        
        int respuesta = sc.nextInt();
    
            switch (respuesta) {
                case 1 -> {
                    System.out.println("Ingrese la altura del triangulo");
                    Double altura = sc.nextDouble();
                    System.out.println("Ingrese la base del triangulo");
                    Double base = sc.nextDouble();
                    Double area_triangulo= (base*altura)/2;
                    System.out.println("El area del traingulo es: "+ area_triangulo);
                }
                case 2 ->{
                    System.out.println("Ingrese lado 1");
                Double lado1 = sc.nextDouble();
                System.out.println("Ingrese lado 2");
                Double lado2 = sc.nextDouble();
                System.out.println("Ingrese el angulo entre el lado 1 y lado 2");
                Double angulo = sc.nextDouble();
                Double anguloRadianes = Math.toRadians(angulo);
                Double area = 0.5 * lado1 * lado2 * Math.sin(anguloRadianes);
                    System.out.println("El area del triangulo es: "+ area);
                }
                case 3 ->{
                    System.out.println("Disculpe se necesita que al menos conosca la base y la altura para calcular el area");
                }
                default -> {
                }
            }
        }
    }
     
      public void CrearMatriz() {
        System.out.println("Ingrese el número de filas de la matriz:");
        int filas = sc.nextInt();
        
        System.out.println("Ingrese el número de columnas de la matriz:");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        int[] resultadoColumna = new int[columnas] ;
        int[] resultadoFila = new int[filas] ;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }
       
        for (int j = 0; j<columnas ;j++) {            
        
            for (int i = 0; i < filas; i++) {
                resultadoColumna[j] += matriz[i][j];
                resultadoFila[i] += matriz[i][j];
            }
        }
        // Llamar al método para imprimir la matriz después de llenarla completamente
        imprimirMatriz(matriz);
         imprimirResultado(resultadoColumna,resultadoFila);
        //sumarFilas(matriz);
    }

    
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.print(item + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
    }
    public static void imprimirResultado(int[] resultadoColumana,int [] resultadoFila) { // Corrected method name
        System.out.println("Suma de las columnas:");
      
       
        System.out.println("Suma columna: "+Arrays.toString(resultadoColumana));
         System.out.println("suma filas: "+Arrays.toString(resultadoFila));
    }
   
     

    

}


