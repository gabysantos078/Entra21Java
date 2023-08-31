import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Faça um programa que leia três notas de um aluno e calcule sua média. 
		   Calcule a situação do aluno baseado na média, onde para ser aprovado o aluno deve ter no mínimo média 7.0. 
		   As notas devem ser somente entre 0 e 10.
		 */
		
		Exercicio3();
	}
	
	public static void Exercicio3() {
		
		float nota1;
		float nota2;
		float nota3;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = new Scanner(System.in).nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = new Scanner(System.in).nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = new Scanner(System.in).nextFloat();
		
		float media = (nota1 + nota2 + nota3) /3;
		System.out.println("Sua média foi: " + media);
		
		if(media >= 7) {
			System.out.println("Parabéns! Você está aprovado.");
		}else {
			System.out.println("Você está reprovado.");
		}
		
	}

}
