package Exercicios.src;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Faça um programa que leia a idade de uma pessoa e informe se ela é maior ou menor de idade. 
		Para ser maior a pessoa precisa ter no mínimo 18 anos*/
		
		Exercicio2();
	}
	
	public static void Exercicio2() {
		
		int idade;
		System.out.println("Informe sua idade: ");
		idade = new Scanner(System.in).nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
	}
}
