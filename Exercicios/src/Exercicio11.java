package Exercicios.src;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*  Faça um programa que solicite ao usuário 5 números inteiros e armazene em um array.
			Em seguida mostre qual o maior e menor numero digitado. */
		
		Exercicio11();
	}

	public static void Exercicio11() {
		
		int[] valores = new int[5];
		
		for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            valores[i] = new Scanner(System.in).nextInt();
		
		}
		
		int maiorValor = valores[0];
        int menorValor = valores[0];
        
        for (int i = 1; i < 5; i++) {
            if (valores[i] > maiorValor) {
            	maiorValor = valores[i];
            }

            if (valores[i] < menorValor) {
            	menorValor = valores[i];
            }
        }
        
        System.out.println("O menor número digitado é: " + menorValor);
        System.out.println("O maior número digitado é: " + maiorValor);
	}
	
}
