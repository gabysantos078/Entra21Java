package Exercicios.src;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/* Uma empresa resolveu conceder aumento para seus funcionários. 
		   Para tal, ela se baseou no cargo do funcionário para conceder o aumento. 
		   O Gerente recebe um aumento de 5%, Supervisores 8%, operadores 9% e demais colaboradores recebem 10%. 
		   O programa deve solicitar o cargo e o salário de cada funcionário e mostrar o salário atual, 
		   qual foi o aumento e qual o valor do novo salário.
		 */
		//Exercicio9();
	}

	public static void Exercicio9 () {

		// Solicita o cargo e o salário do funcionário

		System.out.print("Digite o cargo do funcionário (Gerente, Supervisor, Operador, Outro): ");
		String cargo = new Scanner(System.in).next();
		System.out.print("Digite o salário do funcionário: ");
		double salario = new Scanner(System.in).nextDouble();

		// Definir as taxas de aumento com base no cargo
		double taxaAumento;
		switch (cargo.toLowerCase()) {
			case "gerente":
				taxaAumento = 0.05;
				break;
			case "supervisor":
				taxaAumento = 0.08;
				break;
			case "operador":
				taxaAumento = 0.09;
				break;
			default:
				taxaAumento = 0.10;
				break;
		}

		// Calcular o aumento e o novo salário
		double aumento = salario * taxaAumento;
		double novoSalario = salario + aumento;

		// Mostrar os resultados
		System.out.printf("Salário atual: R$%.2f%n", salario);
		System.out.printf("Aumento: R$%.2f%n", aumento);
		System.out.printf("Novo salário: R$%.2f%n", novoSalario);

	}
}


