/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_2;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int ano_nasc, ano_atual, idade;
        
        System.out.print("Digite o ano de nascimento: ");
        ano_nasc = teclado.nextInt();
        
        System.out.print("Digite o ano atual: ");
        ano_atual = teclado.nextInt();
        
        idade = ano_atual - ano_nasc;
        System.out.println("A sua idade e: "+idade);
        
        
    }
    
}
