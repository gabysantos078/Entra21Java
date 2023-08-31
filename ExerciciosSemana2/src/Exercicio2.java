import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Faça um programa que solicite ao usuário 5 números inteiros e armazene em um array. 
		   Em seguida mostre qual o maior e menor numero digitado.*/
			
		exercicio1 ();

	}
	static void exercicio1 () {
		
		int[] numeros = new int[5];
		int maiorNumero = 0;
		int menorNumero = 0;
				
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Insira 5 valores inteiros desejados: ");
			numeros [i] = new Scanner(System.in).nextInt();
			
			if(numeros [i] > maiorNumero) {
				maiorNumero = numeros [i];
			}else if (numeros [i] < maiorNumero) {
				menorNumero = numeros [i];
			}
		}				
		
		System.out.println("O maior valor é: " + maiorNumero);
		System.out.println("O menor valor é: " + menorNumero);
	}

		
	}