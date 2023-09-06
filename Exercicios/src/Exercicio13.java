package Exercicios.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/* Faça um programa que solicite o nome de uma pessoa e armazene em um array. 
		O usuário de início não sabe quantos nomes deseja inserir, 
		logo o programa deve permitir que o números de contatos seja dinâmico. */
		
		//Exercicio13();
	}
	
	public static void Exercicio13() {
		
		ArrayList<String> nomes = new ArrayList<String>();

        System.out.println("Digite um nome (ou digite 'sair' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = new Scanner(System.in).next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            nomes.add(nome);
        }

        if (nomes.isEmpty()) {
            System.out.println("Encerrando programa, nenhum valor inserido.");
        } else {
            System.out.println("Nomes armazenados:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
	}
	
}
