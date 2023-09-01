package Exercicios.src;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa para calcular o IMC. Basear na tabela da pagina
		
		Exercicio8();
	}
	
	public static void Exercicio8() {
		
		System.out.println("Informe seu peso: ");
		float peso = new Scanner(System.in).nextFloat();
		
		System.out.println("Informe sua altura: ");
		float altura = new Scanner(System.in).nextFloat();
		
		double imc = peso / (altura * altura);
		
		if (imc < 17) {
            System.out.println("Você está muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Você está no peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Você está acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35  && imc <= 39.99) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Obesidade mórbida)");
        }
    }
}