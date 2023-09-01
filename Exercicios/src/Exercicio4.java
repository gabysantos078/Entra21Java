package Exercicios.src;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Faça um programa que leia o valor de um produto e solicite ao usuário um percentual de desconto. 
		   Mostre o valor digitado pelo usuário, o percentual de desconto, o valor do desconto  e o preço com desconto.
		 */
		Exercicio4 ();
	}
	public static void Exercicio4() {
		
		float valorProduto; //criar variavel para armazenar o valor inserido
		float percentualDesconto;
		
		System.out.println("Informe o valor do produto: "); //Solicitar ao usuario o valor do produto
		valorProduto = new Scanner(System.in).nextFloat(); 	//armazenar o valor inserido pelo usuario
		
		System.out.println("Informe o percentual de desconto: ");
		percentualDesconto = new Scanner(System.in).nextFloat();
		
		float desconto = (percentualDesconto / 100) * valorProduto; //calcular o desconto
		float valorFinal = valorProduto - desconto; // calcular valor com o desconto
		
		// Mostrar os valores para o usuario
		
		System.out.println("Valor do produto: R$" + valorProduto);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Preço com desconto: R$" + valorFinal);
	}
}
