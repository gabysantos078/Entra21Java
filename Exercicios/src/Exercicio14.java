package Exercicios.src;

public class Exercicio14 {

    public static void main(String[] args) {
        JogoDaVelha();
    }

    public static void JogoDaVelha() {
        char[][] tabuleiro = new char[3][3];

        System.out.println("Player1 = X");
        System.out.println("Player2 = O");

        boolean win = false;
        int play = 1; // contar jogadas, incrementar quando as jogadas forem bem sucedidas
        char player = 0;
        int linha = 0, coluna = 0;

        while (!win) {

            if (play % 2 == 1) { // player1
                System.out.println("Vez do Player1. Escolha uma coordenada (liha e coluna 1-3)");
                player = 'X';
            } else {
                System.out.println("Vez do Player2. Escolha uma coordenada (liha e coluna 1-3)");
                player = 'O';
            }

        // O jogador deve escolher uma linha/coluna e a jogada deve ser verificada como
        // válida ou inválida.

        boolean linhaValida = false;
        while (!linhaValida) {
            System.out.print("Insira uma linha (Opções: 1, 2, 3");
            linha = new Scanner(System.in).nextInt();

            if (linha >= 1 && linha <= 3) {
                linhaValida = true;
            } else {
                System.out.println("Jogada inválida, tente outra vez.");
            }
        }

        boolean colunaValida = false;
        while (!colunaValida) {
            System.out.println("Insira uma coluna (Opções: 1, 2, 3");
            coluna = new Scanner(System.in).nextInt();

            if (coluna >= 1 && coluna <= 3) {
                colunaValida = true;
            } else {
                System.out.println("Jogada inválida, tente outra vez.");
            }
        }

        linha -= 1; // decrementar o valor das variaveis para que os valores 1,2 e 3 sejam válidos
        // para o usuário.
        coluna -= 1; // decrementar o valor das variaveis para que os valores 1,2 e 3 sejam válidos
        // para o usuário.

        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
            System.out.println("Esta jogada já foi realizada, tente outra vez");
        } else { // joagada valida
            tabuleiro[linha][coluna] = player;
            play++;
        }

        // Imprimir o tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
        // Verificar o vencedor

        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // linha1
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // linha2
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // linha3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // coluna1
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // coluna2
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // coluna3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')) { // diagonal

            win = true;
            System.out.println("Parabéns, Player1 você venceu!");

        } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // linha1
                (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // linha2
                (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // linha3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // coluna1
                (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // coluna2
                (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // coluna3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')) { // diagonal

            win = true;
            System.out.println("Parabéns, Player2 você venceu!");

        } else if (play > 9) {
            win = true;
            System.out.println("Ninguém ganhou.");
        }

    }
}
}
