/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in); 
        //Número a vereficiar si es par 
        int num = 0;
    
        System.out.println("Progroma para verificar si el numero es par");
        
        System.out.println("Ingrese el número a verificar");
        
        num = leer.nextInt(); //Ingrese el número
        
        //Condicion para verificar si el numero es par   
        
        if ( num % 2 == 0 ){
            
            System.out.println("El numero" +num+ "es par");
        }    
    }
    
}
