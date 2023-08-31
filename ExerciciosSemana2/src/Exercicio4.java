import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um programa que solicite o nome de uma pessoa e armazene em um array. 
		O usuário de início não sabe quantos nomes deseja inserir, 
		logo o programa deve permitir que o números de contatos seja dinâmico.*/
		

	       String[] nomes = new String[1];        
	       boolean continuar = true;
	       int contador = 0;
	       
	       while(continuar) {
	           
	           System.out.println("Informe nome");
	           nomes[contador] = new Scanner(System.in).next() ;
	           contador++;
	           
	           System.out.println("Deseja continuar? S-sim");
	           String opcao = new Scanner(System.in).next();
	           continuar = opcao.equalsIgnoreCase("s");
	           
	           if(continuar) {
	               /*String[] arryAux = new String[nomes.length+1];
	               for(int i = 0; i < nomes.length; i++) {
	                   arryAux[i] = nomes[i];
	               }                
	               nomes = arryAux;*/
	               nomes = addArray(nomes);
	           }
	           listarArray(nomes);
	       }

	   }
	   
	   static void listarArray(String[] arr) {
	       for(int i= 0; i < arr.length; i++) {
	           System.out.println(arr[i]);
	       }
	   }
	   
	   static String[] addArray(String[] arr) {
	       String[] arryAux = new String[arr.length+1];
	       for(int i = 0; i < arr.length; i++) {
	           arryAux[i] = arr[i];
	       }
	       return arryAux;
	   }


	}

	

