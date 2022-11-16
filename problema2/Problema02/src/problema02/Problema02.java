/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner (System.in);
         entrada.useLocale(Locale.US);
         
         double cantidad; 
         double precioUnidad;
         double descuento =15;
         double total;
         double total02;
         
         System.out.print("Ingrese la cantidad que se requiere:");
         cantidad = entrada.nextDouble();
         
         System.out.print("Ingrese el precio por unidad:");
         precioUnidad = entrada.nextDouble ();
         total = (cantidad * precioUnidad);
         
         if (cantidad > 50){
             total02 = ( total* descuento)/100;
             total = (total - total02);
             }
         System.out.printf("El total a pagar es de" + " " + total);
      
    }
    
}
