package Exercicios.src;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/* Faça um programa que solicite ao usuário quantas notas deseja digitar. 
		A partir das notas digitadas para o aluno calcule sua média. 
		Calcule a situação do aluno baseado na média. As notas devem ser validadas para não ser menor que ZERO nem maior que DEZ. */

		Exercicio6();
		
	}
	public static void Exercicio6() {
		
		int qtdeNotas;
        System.out.print("Informe a quantidade de notas desejadas: "); // Solicite ao usuário a quantidade de notas a serem digitadas
        qtdeNotas = new Scanner(System.in).nextInt(); // Armazenar a quantidade de notas digitadas 
        
        
        // Valida a quantidade de notas (deve ser pelo menos 1)
        if (qtdeNotas < 1) {
            System.out.println("A quantidade de notas deve ser maior ou igual a 1.");
            return; // Sai do programa se a quantidade de notas for inválida
	}
        
        double somaNotas = 0;
        boolean notasValidas = true;

        // Solicitar ao usuário as notas e calcular a soma
        for (int i = 1; i <= qtdeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = new Scanner(System.in).nextDouble();

            // Verifique se a nota está dentro do intervalo válido
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Informe um valor entre 0 e 10");
                notasValidas = false;
                break; // Sai do loop se uma nota for inválida
            }

            somaNotas += nota;
        }

        // Calcule a média e exiba a situação do aluno
        
        if (notasValidas) {
            double media = somaNotas / qtdeNotas;
            System.out.println("Média do aluno: " + media);

            if (media >= 7.0) {
                System.out.println("Parabéns! Você foi aprovado.");
            } else {
                System.out.println("Você está Reprovado.");
            }
        }

	}   
}
