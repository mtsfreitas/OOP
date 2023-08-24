/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_1;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int x, i,j;
        
        System.out.print("Digite o tamanho da piramide: ");
        x = teclado.nextInt();
        
        for(i=0; i<x; i++){
           for(j=0;j<=i; j++){
           System.out.print("*");
           }
           System.out.print("\n");

        }
        
        
        
        
        
        
        
    }
    
}
