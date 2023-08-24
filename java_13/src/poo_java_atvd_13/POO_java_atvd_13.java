/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_java_atvd_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Martins
 */
public class POO_java_atvd_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
	FileReader fr = new FileReader("clinica.txt");
	BufferedReader br = new BufferedReader(fr);
	String str, nome, nome_paciente_velho = "", nome_mulher_baixa="";
	int idade, qtd_pacientes=0, qtd_homens=0, qtd_mulheres_baixas=0;
	int qtd_jovens_adultos=0, idade_mais_avancada=0;
	float peso, altura, altura_mais_baixa=0;
	double soma_idade_homens=0;
	char sexo;
	StringTokenizer st;
	while((str=br.readLine())!=null){
		st=new StringTokenizer(str, ",");
		nome=st.nextElement().toString();
		sexo=st.nextElement().toString().toUpperCase().charAt(0);
		peso=Float.parseFloat(st.nextElement().toString());
		idade=Integer.parseInt(st.nextElement().toString());
		altura=Float.parseFloat(st.nextElement().toString());
		
		qtd_pacientes++;
		if(sexo=='M'){
			qtd_homens++;
			soma_idade_homens+=idade;
		}else{
			if(1.6<=altura&&altura<=1.7&&peso>70){
				qtd_mulheres_baixas++;
			}
			if(altura_mais_baixa==0||altura<altura_mais_baixa){
				altura_mais_baixa=altura;
				nome_mulher_baixa=nome;
			}
		}
		if(18<=idade&&idade<25){
			qtd_jovens_adultos++;
		}
		if(idade_mais_avancada==0||idade>idade_mais_avancada){
			idade_mais_avancada=idade;
			nome_paciente_velho=nome;
		}
	}
	System.out.println("-> Quantidade de pacientes: "+qtd_pacientes);
	System.out.println("-> Media de idade dos homens: "+(qtd_homens==0?0:((double)soma_idade_homens/qtd_homens)));
	System.out.println("-> Quantidade de mulheres com peso acima de 70kg e "+"altura entre 1,60m e 1,70m: "+qtd_mulheres_baixas);
	System.out.println("-> Quantidade de pessoas com idade entre 18 e 25 anos: "+qtd_jovens_adultos);
	System.out.println("-> Nome do paciente mais velho: "+nome_paciente_velho);
	System.out.println("-> Nome da mulher mais baixa: "+nome_mulher_baixa);
        
    }
    
}
