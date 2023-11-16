/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovectoroptimizado;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class EjercicioVectorOptimizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio:
        1. Crear un vector de enteros de 10 posiciones
        2. Pedirle al usuario que cargue 10 valores para ese vector
        3. Mostrar con foreach el listado de números que ingresó.
        4. Mostrar la suma de todos los elementos
        5. Mostrar el promedio
        6. Indicar cuántos números pares y cuántos impares hay
        7. Indicar cuántas veces se repitió el número 2
        8. Resolver todo dentro de un método que sea invocado dentro del main.
        */
        
        
    resolverEjercicio1();
        
    }

    public static void resolverEjercicio1(){
        
        double[] array = crearArreglo();
        System.out.println("Usted ingresó los siguientes números para realizar operaciones: ");
        for(double a:array) System.out.println(a);
        System.out.println("La suma de los números que ingresó es: "+sumarNumeros(array));
        System.out.println("El promedio de los números que ingresó es: "+promedio(array));
        System.out.println("La suma de los números pares que ingresó es "+contarPar(array));
        System.out.println("La suma de los números impares que ingresó es: "+contarImpar(array));
        System.out.println("La suma de los numeros 2 que ingresó es: "+contarDos(array));
    }
    
    
// 1. 2. 
    
    public static double[] crearArreglo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese diez números para realizar operaciones con ellos: ");
        
        int longitud = 10;
        double[] vector = new double[longitud];
       
        for(int i=0; i<longitud; i++){
            vector[i] = teclado.nextDouble();   
        }
        
        teclado.close();
        return vector;  
    }
    
    
    
// 3. 4. 
    
    public static double sumarNumeros(double[]arreglo){
        
        double suma = 0;
        
        for(double v:arreglo) suma +=v;     
        return suma;
    }
            
// 5. 
    
    public static double promedio(double[]arreglo){
        
        double promedio = sumarNumeros (arreglo) / arreglo.length;
        return promedio;
    }
 
// 6.
    
    public static double contarPar(double[]arreglo){
   
        double contarPar = 0;
       
        for (double v: arreglo) {
            if (v % 2 == 0)
                contarPar++;
        }
        return contarPar;
    }    

    public static double contarImpar(double[]arreglo){
   
        double contarImpar = 0;
       
        for (double v: arreglo){
            if (v % 2 != 0) 
                contarImpar++;
        }
        return contarImpar; 
    } 
    
// 7.    
    
    public static double contarDos(double[]arreglo){
        
        double contarDos = 0;
        
        for (double v:arreglo)
            if (v == 2){
            contarDos++;
            }
        return contarDos;
    }

}
