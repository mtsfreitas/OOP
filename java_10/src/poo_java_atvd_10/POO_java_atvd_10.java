/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     ArrayList<Integer> vetor = new ArrayList<>();
     String entrada;
     int i, n=0;
     Scanner scan = new Scanner(System.in);
     
     while(!(entrada = scan.next()).equals("fim"))
     { 
         vetor.add(Integer.parseInt(entrada)); 
         n++;
     }
    Collections.sort(vetor);
    for(i=0; i<n; i++)
    {
        System.out.println(vetor.get(i));
    }
    
}
            
        }
        
       

    
    

