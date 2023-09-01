package Exercicios.src;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//  Faça um programa que leia dois números e informe qual deles é o maior
		
		Exercicio1();

	}
	
	static void Exercicio1() {
		
		int val1;
		System.out.println("Informe o primeiro valor: ");
		val1 = new Scanner(System.in).nextInt();
		
		int val2;
		System.out.println("Informe o segundo valor: ");
		val2 = new Scanner(System.in).nextInt();
		
		if(val1 > val2) {
			System.out.println("O primeiro valor é o maior: ");
		} else {
			System.out.println("O segundo valor é o maior.");
		}
		
	}
}
