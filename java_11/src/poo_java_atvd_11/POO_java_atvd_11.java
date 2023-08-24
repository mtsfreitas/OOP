/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_11;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int a=0, b=0, mult, soma, sub, opcao;
        float div, resultado=0;
        
         System.out.print("Insira o valor de A: ");
         a = teclado.nextInt();
         System.out.print("Insira o valor de B: ");
         b = teclado.nextInt();
        
        System.out.println("\n[1] Multiplicar "+a+" x "+b);
        System.out.println("[2] Dividir "+a+" / "+b);
        System.out.println("[3] Somar "+a+" + "+b);
        System.out.println("[4] Subtrair "+a+" - "+b+"\n");
        
        opcao = teclado.nextInt();
        
        switch(opcao)
        {
            case 1: resultado = a*b; break; 
            case 2: resultado = a/b; break;
            case 3: resultado = a+b; break;
            case 4: resultado = a-b; break;
            default: System.out.print("Codigo errado!");
        }
        
        System.out.println("RESPOSTA: "+resultado); 
        
    }
    
}
