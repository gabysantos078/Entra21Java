package Exercicios.src;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/* Uma empresa resolveu conceder aumento para seus funcionários. 
		   Para tal, ela se baseou no cargo do funcionário para conceder o aumento. 
		   O Gerente recebe um aumento de 5%, Supervisores 8%, operadores 9% e demais colaboradores recebem 10%. 
		   O programa deve solicitar o cargo e o salário de cada funcionário e mostrar o salário atual, 
		   qual foi o aumento e qual o valor do novo salário.
		 */
		Exercicio5 ();
	}

	public static void Exercicio5 () {
		
		String cargo;
        System.out.print("Informe o cargo do funcionário (Gerente/Supervisor/Operador/Outro): "); // Solicite ao usuário o cargo do funcionário
        cargo = new Scanner(System.in).next(); // recebe o valor informado e armazena na variavel String cargo

        float salario;
        System.out.print("Informe o salário do funcionário: "); // Solicite ao usuário o salário do funcionário
        salario = new Scanner(System.in).nextFloat(); //recebe o valor informado pelo usuario e armazena na variavel float salario

        // Calculo do aumento salarial baseado no cargo
        
        double aumento = 0.0;
        switch (cargo.toLowerCase()) {
            case "gerente":
                aumento = salario * 0.05;
                break;
            case "supervisor":
                aumento = salario * 0.08;
                break;
            case "operador":
                aumento = salario * 0.09;
                break;
            default:
                aumento = salario * 0.10;
                break;
        }

        // Calculo do novo salário
        double novoSalario = salario + aumento;

        // Output
        System.out.println("Salário atual: R$" + salario);
        System.out.println("Aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + novoSalario);
		
	}
	
}
