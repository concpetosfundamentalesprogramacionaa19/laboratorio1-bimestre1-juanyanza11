/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        // VARIABLES DE TIPO CADENA
        String nota1;
        String nota2;
        String nota3;
        double promedio;
        
        // PERDIR DATOS POR TECLADO
        System.out.println("Ingrese su nota 1");
        nota1= entrada.nextLine();
        System.out.println("Ingrese su nota 2");
        nota2= entrada.nextLine();
        System.out.println("Ingrese su nota 3");
        nota3 = entrada.nextLine();
        
        // TRANSFORMAR STRING A DOUBLE
        
        double pnota1 = Double.parseDouble(nota1);
        double pnota2 = Double.parseDouble(nota2);
        double pnota3 = Double.parseDouble(nota3);
       
        // PROCESO
        promedio =(pnota1+pnota2+pnota3)/3;
        
        String resultado = promedio > 14 ? "Usted pasó el año lectivo" : "Usted no aprobó el año lectivo";
        
        System.out.printf("%s\n",resultado);
    }
    
}
