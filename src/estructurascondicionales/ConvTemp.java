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
public class ConvTemp {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        double gC, gF, gK;
        gC = 0; gF = 0; gK = 0;
        
        System.out.println("Programa para convertir de grados centigrados"
                + "a grados Farenheit y a grados kelvin");
        
        System.out.println("Ingrese los grados centigrados");
        gC = leer.nextDouble();
        
        //Condición para conersión de grados de temperatura
        
        if ( gC > 0 ) {
            gF = (gC * 9/5) + 32;
            gK = (gC + 273.15);
            
            System.out.println("La equivalencia en grados F es:" +gF);
            System.out.println("La equivalencia en grados K es:" +gK);
            
        }
            
            
            
    }
    
    
}
