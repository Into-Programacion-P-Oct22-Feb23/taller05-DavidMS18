/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5problema04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Taller5Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner (System.in);
         entrada.useLocale(Locale.US);
         
         int numeroDias;
         double descuento = 0;
         double costoDiario;
         double subTotal;
         double valorPagar = 0;
         
         
         System.out.print ("Ingrese el numero de dias hospedado:");
         numeroDias = entrada.nextInt();
         
         System.out.print ("Ingrese el precio por dia:");
         costoDiario = entrada.nextDouble();
         
         subTotal = (numeroDias * costoDiario);
         
         if(numeroDias > 5){
             descuento = (subTotal * 10)/100;
             valorPagar = (subTotal - descuento);
         }else if(numeroDias > 10){
             descuento = (subTotal * 15)/100;
             valorPagar = (subTotal - descuento);
        }else if(numeroDias > 15){
             descuento = (subTotal * 20)/100;
             valorPagar = (subTotal - descuento); 
        } 
        System.out.printf("El subtotal que tiene que pagar es de: %.1f\n" 
            + "El descuento que tiene es de:%.1f\n" + "El total a pagar es de: %.1f\n", 
                subTotal, descuento, valorPagar);
    
         
        
    
         
    }
    
}
