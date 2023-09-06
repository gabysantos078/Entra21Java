package Exercicios.src;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/* Faça um programa que leia o valor de um produto e sua quantidade. 
		   O usuário pode desejar inserir mais de um produto. 
		   Ao finalizar a digitação mostre quantos produtos foram digitados, o valor total e a soma das quantidades digitadas.
		 */
		//Exercicio7();
	}

	public static void Exercicio7() {
		
		double valorTotal = 0;
        int somaQuantidades = 0;
        int produtosDigitados = 0;

        while (true) {
            
            System.out.print("Digite o valor do produto (ou digite 0 para encerrar): "); // Solicite ao usuário o valor do produto
            double valorProduto = new Scanner(System.in).nextDouble();

            // Verifique se o usuário deseja encerrar a entrada de produtos
            if (valorProduto == 0) {
                break; // Sai do loop se o valor for 0
            }

            
            System.out.print("Digite a quantidade do produto: "); // Solicite ao usuário a quantidade do produto
            int quantidadeProduto = new Scanner(System.in).nextInt();

            
            double valorProdutoTotal = valorProduto * quantidadeProduto; // Calcule o valor total para o produto atual

            // Atualizar as variáveis
            valorTotal += valorProdutoTotal;
            somaQuantidades += quantidadeProduto;
            produtosDigitados++;
        }

        // Mostrar os resultados
        System.out.println("Produtos digitados: " + produtosDigitados);
        System.out.println("Valor total dos produtos: R$" + valorTotal);
        System.out.println("Soma das quantidades digitadas: " + somaQuantidades);

 
    }
}
