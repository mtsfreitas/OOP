/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_9;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int N, i, numero, menor=0, maior=0, qtd_par=0, qtd_impar=0;
        float media=0;
        
        System.out.print("Digite o valor de N: ");
        N = teclado.nextInt();
        
        if(N>0 && N<1000)
        {
            for(i=1; i<=N; i++)
            {
                 System.out.print("["+i+"] "+"Digite um numero: ");
                 numero = teclado.nextInt();
                 
                 media= media+numero;
                 
                 if(numero%2==0)
                 {
                     qtd_par++;
                 }
                 else
                     qtd_impar++;
                 
                 if(i==1)
                 {
                     menor = numero;
                     maior = numero;
                 }
                 else
                 {
                     if(menor > numero)
                     {
                         menor = numero;
                     }
                     else
                         maior = numero;
                 }
            }
           
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Qtd par: "+qtd_par);
        System.out.println("Qtd impar: "+qtd_impar);
        System.out.println("Media Aritimetica: "+media/N);
       


    }
    
}
