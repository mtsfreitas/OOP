/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_5;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        String mes;
        int numero_do_mes=0;
        
        System.out.print("Digite o mes: ");
        mes = teclado.next();
        
        switch(mes)
        {
            case "janeiro": numero_do_mes = 1; break;
            case "fevereiro": numero_do_mes = 2; break;
            case "marco": numero_do_mes = 3; break;
            case "abril": numero_do_mes = 4; break;
            case "maio": numero_do_mes = 5; break;
            case "junho": numero_do_mes = 6; break;
            case "julho": numero_do_mes = 7; break;
            case "agosto": numero_do_mes = 8; break;
            case "setembro": numero_do_mes = 9; break;
            case "outubro": numero_do_mes = 10; break;
            case "novembro": numero_do_mes = 11; break;
            case "dezembro": numero_do_mes = 12; break;
            default: System.out.println("Mes incorreto!");

            
            
        }
        System.out.println("O dia do mes e: "+numero_do_mes);

        
        
                }
    
}
