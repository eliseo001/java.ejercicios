/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class operaciones {
    public void AreaCirculo(){
        System.out.println("Ingrese el radio del circulo");
        Scanner sc = new Scanner(System.in);
        
        double radio=sc.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
       // double area=num*Radiocuadrado;
        System.out.println("El area del circulo es "+ area+"cm*2 ");
    }
    
    public void TotalPagar(){
        double PkiloMenor10 = 20.50;
        double PkiloMayor10 = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de su paquete");
        double peso=sc.nextDouble();
        if (peso<10){
            System.out.println("El precio a pagar por el envio es de $20.50 por kilo, usted tine que abonar: $"+peso*PkiloMenor10);
            
        }else{
            System.out.println("El precio a pagar por el envio es de $18 por kilo, usted tine que abonar: $"+peso*PkiloMayor10);
        }
        
    }
    public void SueldoEmpleado(){
        System.out.println("Ingrese el sueldo");
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
       
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
        Scanner sc= new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
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
}
