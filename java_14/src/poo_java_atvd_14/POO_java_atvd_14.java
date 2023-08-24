/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_14;

import java.util.Scanner;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_14 {

   
    public static float negToPos(float v){
        if(v<0) return -v;
        return v;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         
        int minutos=0, ligacao=3;
        float saldo=100, saldo_extra=50, saldo_excedente=0, valor=0, valor_pagar=0, mensalidade=50 ;
        String opcao;

        while(ligacao!=0){
              
            System.out.print("'o' = outras operadoras\n'v' = a propria Vai-Vai\n'f' = telefone fixo\n Opcao:  ");
            opcao = teclado.next();

            System.out.print("Quantidade de minutos: ");       
            minutos = teclado.nextInt();
            
            //saldo= saldo+ minutos; 
                
            switch(opcao)
                {
                    case "o": 
                        if(saldo>0){
                               saldo=saldo-minutos;
                               if(saldo<0)
                               {
                                   saldo_excedente= negToPos(saldo);
                               }
                        }
                        else
                        {
                            saldo = saldo - minutos;
                            saldo_excedente = negToPos(saldo);
                        }
                        if(saldo_excedente>=0){
                            valor = saldo_excedente;
                        }
                        
                        valor_pagar= (float) ((valor)*0.65);break;                                 
                               



                    case "v": if(saldo_extra>=0 && saldo_extra<=50){
                                saldo_extra = saldo_extra - minutos;
                                if(saldo_extra<0)
                                {
                                    saldo_excedente= negToPos(saldo_extra);
                                }    
                              }
                              if(saldo>0 && saldo_excedente>0){
                                  saldo = saldo-saldo_excedente;
                                  if(saldo<0)
                                  {
                                      saldo_excedente+= negToPos(saldo);
                                  }
                              }
                              else if(saldo>0 && saldo_extra<0){
                                    {
                                        saldo= saldo - minutos;
                                    }
                                    if(saldo<0)
                                    {
                                        saldo_excedente = negToPos(saldo);
                                    }
                                    if(saldo_excedente>=0)
                                        valor = saldo_excedente;
                              }
                        
                        
                        
                        valor_pagar = (float) ((valor)*0.2); break; //50 +100+50

                        
                    case "f": valor_pagar = (float) ((minutos)*0.5);break; 


                    default: System.out.print("Opcao Incorreta. "); 
                }

                  

                  System.out.print("\n[0] parar, !=0 continue ligando: "); 
                  ligacao = teclado.nextInt();
        }
        if(ligacao==0){
                   if(saldo<0)
                   {
                       saldo=0;
                   }
                   if(saldo_extra<0)
                   {
                       saldo_extra=0;
                   }
                   System.out.println("\nSaldo P/ outras OP: "+saldo);
                   System.out.println("Saldo P/ Vai Vai: "+(saldo_extra));
            System.out.println("\nValor total a pagar: "+(valor_pagar+mensalidade));   
        }
        
    }
    
}
