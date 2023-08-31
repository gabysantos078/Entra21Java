import java.util.Scanner;

public class Exercicio1 {
		
	public static void main(String[] args) {
		/*Faça um programa que solicite ao usuário quantos números precisa inserir. 
		  Após isso crie um array de inteiros e solicite ao usuário os números a serem armazenados.*/
		 
		exercicio1 ();

	}
	static void exercicio1 () {
		
		int[] numeros = new int[5];
				
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Insira 5 valores inteiros desejados: ");
			numeros [i] = new Scanner(System.in).nextInt();
		}				
		
	}

		
	}