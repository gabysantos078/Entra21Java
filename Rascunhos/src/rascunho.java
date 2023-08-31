import java.util.Scanner;

public class rascunho {

	public static void main(String[] args) {
		
	
		/*String[][] campo = new String[3][3];
		
		
		campo[0][0] = "-";
	    campo[1][1] = "-";
	    campo[2][2] = "-";
	    campo[3][3] = "-";
		

		boolean jogar = true;
	       int tentativa = 0;
	       int pontos = 0;
	       while (jogar) {
	           
	    	   
	    	   // solicitar local de jogada
	           System.out.println("Informe linha: ");
	           int linha = new Scanner(System.in).nextInt();

	           System.out.println("Informe coluna: ");
	           int coluna = new Scanner(System.in).nextInt();
	           
	           if (campo[linha][coluna] < campo.lenght ("0")) {
	               System.out.println("-");
	               pontos += 3;
	           } else {
	               System.out.println("Tente de novo! vc errou.");
	           }
	           tentativa++;
	           if(tentativa == 5) {
	               break;
	           }
	           jogar = (pontos < 6);
	           
	       }       
	}

}
		
		static void jogoDaVelha () {
			
			String [] [] jogo = new String [3] [3];
			String [] posições = new String [9];
			String [] jogador = "X";
			
			boolean jogo = true;
			int attempt = 0;
			int aux = 0;
			
		}
			
		
		
		String[][] mapa = new String[3][3];
		
		static void verCampo(String[][] grade) {
		       for (int linha = 0; linha < grade.length; linha++) {
		           for (int coluna = 0; coluna < grade[linha].length; coluna++) {
		               System.out.print(grade[linha][coluna] + " ");
		           }
		           System.out.println();
		
		
		           
		       }     
		}

	} */  		


/*(import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	// Jogo da velha
		
		String[][] mapa = new String[4][4];
		
	// Criar método para preencher matriz

	static void preencherMatriz(String[][] grade) {
		       for (int linha = 0; linha < grade.length; linha++) {
		           for (int coluna = 0; coluna < grade[linha].length; coluna++) {
		               grade[linha][coluna] = "x";
		           }
	// Criar metodo para mostrar a matriz

	static void verMapa(String[][] grade) {
		for (int linha = 0; linha < grade.length; linha++) {
			for (int coluna = 0; coluna < grade[linha].length; coluna++) {
				System.out.print(grade[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

	// Criar metodo para jogar

	static void Jogar(String Player, String[][] posicoes) {
		System.out.println("Digite o numero para marcar O " + Player);
		int input = new Scanner(System.in).nextInt();
		switch (input) {

		case 1:
			posicoes[0][0] = Player;
			break;
		case 2:
			posicoes[0][1] = Player;
			break;
		case 3:
			posicoes[0][2] = Player;
			break;
		case 4:
			posicoes[1][0] = Player;
			break;
		case 5:
			posicoes[1][1] = Player;
			break;
		case 6:
			posicoes[1][2] = Player;
			break;
		case 7:
			posicoes[2][0] = Player;
			break;
		case 8:
			posicoes[2][1] = Player;
			break;
		case 9:
			posicoes[2][2] = Player;
			break;
		default:
			System.out.println();
		}

	}

	// Realizar jogada
	
	boolean jogar = true;
    int tentativa = 1;
    int pontos = 0;
    while (jogar) {
        // solicitar coordenadas do disparo
        System.out.println("Informe linha: ");
        int linha = new Scanner(System.in).nextInt();

        System.out.println("Informe coluna: ");
        int coluna = new Scanner(System.in).nextInt();
        
        if (mapa[linha][coluna].equals("N")) {
            System.out.println("Vc acertou um navio");
            pontos += 3;
        } else {
            System.out.println("Tente de novo! vc errou.");
        }
        tentativa++;
        if(tentativa == 5) {
            break;
        }
        jogar = (pontos < 6);
    }
}

	// verificar vencedor

	// Troca de turno (X ou O)

}

} */

