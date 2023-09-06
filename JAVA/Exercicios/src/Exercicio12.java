package Exercicios.src;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//Faça um programa que receba 5 números inteiros, após isso mostre o array ordenado em ordem crescente.
		
		//Exercicio12();
	}

	public static void Exercicio12() {
		
		int[] numeros = new int[5]; //inicializa o array atribuindo um valor a ele

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: "); //solicita o usuario os números a ser inseridos condizendo com a quantidade estipulada no Array
            numeros[i] = new Scanner(System.in).nextInt();
        }

        // Ordenar o array em ordem crescente usando o Arrays.sort
        Arrays.sort(numeros);

        System.out.println("Array ordenado em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) +  "º:" + " Número:" + numeros[i]);
        }
	}
	
}
