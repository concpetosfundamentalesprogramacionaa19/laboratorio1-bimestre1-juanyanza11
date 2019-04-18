/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
                
        //DECLARACION DE VARIABLES Y SCANNER
        
        Scanner entrada = new Scanner (System.in);
        String x;
        String y;
        String z;
        double m;
        
        //PEDIR DATOS E INGRESAR POR TECLADO
        System.out.println("Ingrese el valor de la variable X");
        x = entrada.nextLine();
        System.out.println("Ingrese el valor de la variable Y");
        y= entrada.nextLine();
        System.out.println("Ingrese el valor de la variable Z");
        z= entrada.nextLine();
        
        //TRANSFORMAR DE STRING A DOUBLE
        
        double numx = Double.parseDouble(x);
        double numy = Double.parseDouble(y);
        double numz = Double.parseDouble(z);
        m= (numx+(numy/numz))/(numx-(numy/numz));
    
        //PRESENTAR DATOS EN PANTALLA CON FORMATO
        
        System.out.printf("\nEl valor de m, en base a las variables:\n "
                + "x=%.1f\n\ty=%.1f\n\t\t z=%.1f\nda como resultado:\n\t\t\t "
                + "m=%.1f\n",numx,numy,numz,m);
        
    }
    
}
