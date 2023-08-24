/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_7;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        Scanner teclado = new Scanner(System.in);
        
        int hora_1, minutos_1, segundos_1, hora_2, minutos_2, segundos_2, hora_1_total=0, hora_2_total=0, diferenca_horas;
        
        System.out.print("[1] Digite a hora: ");
        hora_1 = teclado.nextInt();
         System.out.print("[1] Digite o(s) minuto(s): ");
        minutos_1 = teclado.nextInt();
         System.out.print("[1] Digite o(s) segundos: ");
        segundos_1 = teclado.nextInt();
        
        hora_1_total = minutos_1*60;
        hora_1_total = hora_1_total +  hora_1 *60*60;
        hora_1_total = hora_1_total + segundos_1;
                
        System.out.print("\n[2] Digite a hora: ");
        hora_2 = teclado.nextInt();
         System.out.print("[2] Digite o(s) minuto(s): ");
        minutos_2 = teclado.nextInt();
         System.out.print("[2] Digite o(s) segundo(s): ");
        segundos_2 = teclado.nextInt();
        
        hora_2_total = minutos_2*60;
        hora_2_total = hora_2_total +  hora_2 *60*60;
        hora_2_total = hora_2_total + segundos_2;
        
        
        System.out.println("h1"+hora_1_total);
        System.out.println("h2"+hora_2_total);
        
       if(hora_1_total >= hora_2_total)
       {
           diferenca_horas = hora_1_total - hora_2_total;
           System.out.println("A diferenca da hora 1 para hora 2 e: "+diferenca_horas+" segundos");
       }
       else{
           diferenca_horas = hora_2_total - hora_1_total;
           System.out.println("A diferenca da hora 2 para hora 1 e: "+diferenca_horas+" segundos");
       }
        
        
    }
    
}
