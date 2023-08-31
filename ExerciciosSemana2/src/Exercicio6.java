import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Jogo da velha

		jogar();
	}

	static void jogar() {
		String[][] jogo = new String[3][3];
		preencherTabuleiro(jogo);

		boolean vencedor = false;
		String simbolo = "X";
		while (!vencedor) {
			System.out.print("Informe linha: ");
			int linha = new Scanner(System.in).nextInt();

			System.out.print("Informe coluna: ");
			int coluna = new Scanner(System.in).nextInt();

			if (linha > 2 || coluna > 2 || linha < 0 || coluna < 0) {
				System.out.println("Jogada inválida");
				continue;
			}

			if (!jogo[linha][coluna].equals("-")) {
				System.out.println("Jogada já realiada");
				continue;
			}

			jogo[linha][coluna] = simbolo;

			vencedor = verificarVencedor(jogo);

			if (!vencedor)
				simbolo = simbolo.equals("X") ? "O" : "X";

			listarTabuleiro(jogo);
		}
		
	}

	static boolean verificarVencedor(String[][] tabuleiro) {

		String [] vencedor = new String [8];
				
		vencedor[0]	= tabuleiro [0][0] + tabuleiro [0][1] + tabuleiro [0][2];
		vencedor[1]	= tabuleiro [1][0] + tabuleiro [1][1] + tabuleiro [1][2];
		vencedor[2]	= tabuleiro [2][0] + tabuleiro [2][1] + tabuleiro [2][2];
		vencedor[3]	= tabuleiro [0][0] + tabuleiro [1][0] + tabuleiro [2][0];
		vencedor[4]	= tabuleiro [0][1] + tabuleiro [1][1] + tabuleiro [2][1];
		vencedor[5]	= tabuleiro [0][2] + tabuleiro [1][2] + tabuleiro [2][2];
		vencedor[6]	= tabuleiro [0][0] + tabuleiro [1][1] + tabuleiro [2][2];
		vencedor[7]	= tabuleiro [0][2] + tabuleiro [1][1] + tabuleiro [2][0];
		
		for(int total = 0; total < vencedor.length; total++) {
			if(vencedor [total].contains("XXX")) {
				System.out.println("X é o vencedor!");
				return true;
			}else if (vencedor[total].contains("OOO")) {
				System.out.println("O é o vencedor!");
				return true;
			}

		}
		return false;

	}

	static void preencherTabuleiro(String[][] tabuleiro) {
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				tabuleiro[linha][coluna] = "-";
			}
		}
	}

	static void listarTabuleiro(String[][] tabuleiro) {
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
				System.out.print(tabuleiro[linha][coluna]);
			}
			System.out.println();
		}
	}

}