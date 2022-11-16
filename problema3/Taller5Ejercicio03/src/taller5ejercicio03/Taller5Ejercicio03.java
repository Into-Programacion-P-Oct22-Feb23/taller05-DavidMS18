/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5ejercicio03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Taller5Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
         entrada.useLocale(Locale.US);
        
         String marca;
         double costo;
         String origen;
         double impuesto;
         double valorTotal;
         
         System.out.print("Ingrese la marca del automovil:");
         marca = entrada.nextLine();
         
         System.out.print("Ingrese el origen del automovil:");
         origen = entrada.nextLine();
         
         System.out.print("Ingrese el costo del automovil:");
         costo = entrada.nextDouble();
         valorTotal = costo;
         
         if(origen.equals("Alemania")){
             impuesto = (valorTotal * 20)/100;
             valorTotal = valorTotal + impuesto;
         }else if (origen.equals("Japon")){
             impuesto = (valorTotal * 30)/100;
             valorTotal = valorTotal + impuesto;
         }else if(origen.equals("Italia")){
             impuesto = (valorTotal * 15)/100;
             valorTotal = valorTotal + impuesto;
         }else if(origen.equals("Estados Unidos")){
             impuesto = (valorTotal * 8)/100;
             valorTotal = valorTotal + impuesto;
         }
        
         System.out.printf ("Su automovil de origen %s\n" +
            "Su precio es de: %.1f\n", origen, valorTotal);
         
    }
    
}
