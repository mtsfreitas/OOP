/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_8;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        
        int N, i, numero, soma=0, produto=0;
        
        System.out.print("Digite o valor de N: ");
        N = teclado.nextInt();
        
        if(N>0 && N<100)
        {
            for(i=1; i<=N; i++)
            {
                 System.out.print("["+i+"] "+"Digite um numero: ");
                 numero = teclado.nextInt();
                 soma = soma+numero;
                 if(i==1)
                 {
                     produto = numero;
                 }
                 else
                 {
                     produto = produto*numero;
                 }
            }
           
        }
       
        System.out.println("A soma e: "+soma);
        
        System.out.println("O produto e: "+produto);

    }
    
}
