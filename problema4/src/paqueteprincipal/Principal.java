/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args){  
        String comparar;
        comparar = MiClase1.edad > 18 ? "mayor de edad" :"menor de edad";
        
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s y %s\n",MiClase2.nombre,MiClase3.apellido,MiClase1.edad,comparar);
}
}
