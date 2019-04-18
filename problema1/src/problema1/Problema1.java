/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        // TODO code application logic here
        //DECLARACION DE VARIABLES
      int numeroH;
      double descuentoS;
      double sueldo;
      double costoh;
      double sueldofinal;
      
      //INGRESO DE DATOS POR TECLADO}
      
      System.out.println("\n Ingrese el número de horas");
      Scanner entrada = new Scanner(System.in);
      numeroH = entrada.nextInt();
      System.out.println("\n Ingrese el costo por hora");
      costoh= entrada.nextDouble();
      
      //PROCESO CALCULO DESCUENTO Y SUELDO
      
      sueldo = numeroH*costoh;
      descuentoS= (0.10*sueldo);
      sueldofinal = sueldo -(0.10*sueldo);
      
      //MOSTRAR DATOS EN PANTALLA
      
      System.out.printf("Su sueldo a pagar es: %.2f\nCon un descuento de 10 por ciento"
              + " por el seguro social de: %.2f"
              + "\nSu sueldo final es: %.2f",sueldo,descuentoS,sueldofinal);
      
      
      
      
      
    }
    
}

