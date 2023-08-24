/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_12;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         
        int numero = 0, i, tentativas = 1;
        
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        
        while(numero!=randomInt)
        {
            
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            
            if(numero==randomInt)
            {
                System.out.print("\nParabens, voce acertou!");
                System.out.print("\nTentativas: "+tentativas+"\n");
                break;
            }
            else
                tentativas++;
            
            if(randomInt<numero)
            {
                System.out.println("O Numero e menor!\n");
            }
            else
                System.out.println("O numero e maior!\n");
            
        }
        
        
       
    }
    
}
