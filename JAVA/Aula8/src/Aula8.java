import java.util.Scanner;

public class Aula8 {
   /*
     criar metodo para preencher matriz -> Posicionar alguns objetos no mapa ->
     permitir que o usuario faça mais de uma tentativa -> incrementar tentativa e
     pontuação -> cada N soma 3pt -> pode jogar 5vezes; -> se somou mais de 6pts
     ganha;
    */
   public static void main(String[] args) {
       String[][] mapa = new String[4][4];
       preencherMatriz(mapa);
       // verMapa(mapa);

       mapa[2][2] = "N";
       mapa[1][1] = "N";
       mapa[3][3] = "N";
       mapa[2][1] = "N";

       // jogar
       
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

   static void preencherMatriz(String[][] grade) {
       for (int linha = 0; linha < grade.length; linha++) {
           for (int coluna = 0; coluna < grade[linha].length; coluna++) {
               grade[linha][coluna] = "x";
           }
       }
   }

   static void verMapa(String[][] grade) {
       for (int linha = 0; linha < grade.length; linha++) {
           for (int coluna = 0; coluna < grade[linha].length; coluna++) {
               System.out.print(grade[linha][coluna] + " ");
           }
           System.out.println();
       }
   }

   static void acessarPosicoes() {
       /*
        * X X X X X X X X X X X X N X X X X X X X X X X X X
        */
       String[][] mapa = new String[4][4];

       mapa[2][2] = "N";

       System.out.println("Informe linha: ");
       int linha = new Scanner(System.in).nextInt();

       System.out.println("Informe coluna: ");
       int coluna = new Scanner(System.in).nextInt();
       if (mapa[linha][coluna].equals("N")) {
           System.out.println("Vc acertou um navio");
       } else {
           System.out.println("Tente de novo! vc errou.");
       }

   }

   static void conceitos() {
       int[][] grade = { { 3, 5, 6, 8 }, { 4, 1, 5, 7 }, { 2, 3, 4, 5 }, { 5, 4, 3, 2 } };
       /*
        * System.out.println(grade[0][0]); System.out.println(grade[1][0]);
        * System.out.println(grade[3][3]);
        */
       // System.out.println("Tamanho: " + grade.length);

       for (int linha = 0; linha < grade.length; linha++) {
           for (int coluna = 0; coluna < grade[linha].length; coluna++) {
               System.out.print(grade[linha][coluna] + " ");
           }
           System.out.println();
       }

   }

}