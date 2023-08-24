/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_4;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float sal_liquido, sal_bruto, val_descontos, val_emprestimo, emprestimo_permitido;
        
        System.out.print("Digite o valor do salario bruto: ");
        sal_bruto = teclado.nextFloat();
        
        System.out.print("Digite o valor de descontos: ");
        val_descontos = teclado.nextFloat();
        
        sal_liquido = sal_bruto - val_descontos;
        
        System.out.print("Digite o valor do emprestimo: ");
        val_emprestimo = teclado.nextFloat();
        
        emprestimo_permitido = sal_liquido*30/100;
       
        
        if((emprestimo_permitido>=val_emprestimo))
        {
             System.out.println("Emprestimo aceito! ");
        }
        else
            System.out.println("Emprestimo negado! ");
    }
    
}
