/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_6;

import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class POO_java_atvd_6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dia, mes;
        String nome_mes;
        
        System.out.print("Dia do aniversario: ");
        dia = teclado.nextInt();
        
        System.out.print("Mes do aniversario: ");
        mes = teclado.nextInt();
        
        
        
        if(dia>=1)
        {
            if(mes==2 && dia<=29)
            {
                System.out.println("Fevereiro");
                System.out.println("Data Valida");
            }
            else if((mes == 4 || mes == 6 || mes == 9 || mes ==10) && dia<=30)
            {
                switch(mes){
                    case 4: System.out.println("Abril"); break;
                    case 5: System.out.println("Junho"); break;
                    case 6: System.out.println("Setembro"); break;
                    case 10: System.out.println("Outubro"); break; 
                }
                System.out.println("Data Valida");
            }
            else if((mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 11 || mes == 12) && dia<=31){
                
                switch(mes){
                    case 1: System.out.println("Janeiro"); break;
                    case 3: System.out.println("Março"); break;
                    case 5: System.out.println("Maio"); break;
                    case 7: System.out.println("Julho"); break; 
                    case 8: System.out.println("Agosto"); break; 
                    case 11: System.out.println("Novembro"); break; 
                    case 12: System.out.println("Dezembro"); break; 
                }
                System.out.println("Data Valida");
            }
            else
            {
                System.out.println("Data invalida");
            }
        }else
        {
            System.out.println("Data invalida");
        }
    }
}
