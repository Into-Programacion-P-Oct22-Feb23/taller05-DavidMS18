/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Taller5Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        String marca; 
        String origen;
        double costo; 
        double impuesto; 
        double valorPagar; 
        
        System.out.println ("Ingrese la marca de su vehiculo:");
        marca = entrada.nextLine();
        
        System.out.println("Ingrese el origen de su vehiculo:");
        origen = entrada.nextLine();
        
        System.out.println("Ingrese el costo de su vehiculo:");
        costo = entrada.nextDouble();
        
        if (origen.equals("Alemania")){ 
        impuesto = (costo * 20)/100;
        valorPagar = (costo + impuesto); 
        
        System.out.printf("El impuesto del vehiculo es \n%.1f\n" + 
        "El costo del vehiculo es de \n%.1f\n", impuesto,valorPagar);
        
        }else if (origen.equals("Japon")){
        impuesto = (costo * 30)/100;
        valorPagar = (costo + impuesto); 
        
        System.out.printf("El impuesto del vehiculo es: \n%.1f\n" +
        "El costo del vehiculo es de: \n%.1f\n", impuesto,valorPagar);
        }
        
        if(origen.equals("Italia")){
        impuesto = (costo * 15)/100;
        valorPagar = (costo + impuesto);
        
        System.out.printf("El impuesto del vehiculo es \n%.1f\n" +
        "El costo del vehiculo es de \n%.1f\n", impuesto,valorPagar);
        
        }else if(origen.equals("Estados Unidos"));{
        impuesto = (costo * 8)/100;
        valorPagar = (costo + impuesto);
        
        System.out.printf("El impuesto del vehiculo es \n%.1f\n" +
        "El costo del vehiculo es de \n%.1f\n", impuesto,valorPagar);
        }        
    }
}

      