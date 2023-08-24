/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_3;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner teclado = new Scanner(System.in);
        
        float numerador, denominador, num_real;
        
        System.out.print("Digite o numerador: ");
        numerador = teclado.nextFloat();
        
        System.out.print("Digite o denominador: ");
        denominador = teclado.nextFloat();
        
        if(denominador ==0)
        {
           System.out.print("Denominador = 0, indeterminacao!");
        }
        else
        {
            num_real = numerador/denominador;
            System.out.println("O numero real e: "+num_real);
        }
        
        
        
        
    }
    
}
