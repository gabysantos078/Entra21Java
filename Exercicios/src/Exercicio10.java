package Exercicios.src;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/* Faça um programa que solicite ao usuário quantos números precisa inserir. 
		Após isso crie um array de inteiros e solicite ao usuário os números a serem armazenados. */
		
		//Exercicio10();
		
		
	}
	
	public static void Exercicio10() {
		
		System.out.print("Quantos números deseja inserir? ");
        int qtde = new Scanner(System.in).nextInt();

        int[] qtdeNum = new int[qtde];

        for (int i = 0; i < qtde; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            qtdeNum[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Números inseridos no array:");
        for (int i = 0; i < qtde; i++) {
            System.out.println((i + 1) +  "º:" + " Número:" + qtdeNum[i]);
        }


	}
}
