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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración de var
        double num1, num2, resp;
        int opc;
        num1 = 0; num2 = 0; resp = 0; opc = 0;
        System.out.println("Calculadora de operaciones basicas \n");
        System.out.println("Ingrese el valor del número 1");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del número 2");
        num2 = leer.nextDouble();
        //Menu de opciones en pantalla
        
        System.out.println("Escoja una de las siguientes opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        //Se ingresa la opción
        opc = leer.nextInt();
        
        //Se realiza la calculadora con las operaciones básicas
        
        switch (opc){
            case 1: {
                resp = num1 + num2;
                System.out.println("La suma es: " +resp);
            }
            break;
            case 2: {
                resp = num1 - num2;
                System.out.println("La resta es: " +resp);
            }
            break;
            case 3: {
                resp = num1 * num2;
                System.out.println("La multiplicación es: " +resp);
            }
            break;
            case 4: {
                resp = num1 / num2;
                System.out.println("La división es: " +resp);
            }
            break;
            default:
                System.out.println("Opción invalida");
            break;
        } 
    }
}
