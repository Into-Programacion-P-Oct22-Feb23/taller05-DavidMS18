/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller05problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Taller05Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double kilovatioNumero;
        double costoPlanilla;
        int edad; 
        double descuento = 10;
        double costo;
        
        System.out.print ("Ingrese el costo de Kilovatio/hora");
        costoKilovatio = entrada.nextDouble();
        
        System.out.print ("Ingrese el numero de Kilovatios consumidos");
        kilovatioNumero = entrada.nextDouble();
        
        System.out.print ("Ingrese su edad");
        edad = entrada.nextInt();
        
        costoPlanilla = costoKilovatio * kilovatioNumero; 
        
        if(edad > 65){
            costo = (costoPlanilla * descuento)/100;
            
            costoPlanilla = (costoPlanilla- costo);
    }
      System.out.printf ("El valor total a cancelar es de" + " " 
            + costoPlanilla);  
    }
    
}
