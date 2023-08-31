import java.util.Scanner;

public class Aula4 {

   /*
    * Faça um programa que leia três notas de um aluno
    * e calcule sua média.
    * Calcule a situação do aluno baseado na média.
    */
   public static void main(String[] args) {
       loopsDinamico();
   }
   
   static void loopsDinamico() {
       /*boolean continuar = true;
       while(continuar) {
           //codigo a ser repetido
           System.out.println("Informe nome");
           String nome = new Scanner(System.in).next();
           
           System.out.println("Deseja continuar? 1-Sim");
           int opcao = new Scanner(System.in).nextInt();
           continuar = (opcao == 1);            
       }
       System.out.println("fim do programa");*/
       
       boolean continuar = true;
       while(continuar) {
           //codigo a ser repetido
           System.out.println("Informe nome");
           String nome = new Scanner(System.in).next();
           
           System.out.println("Deseja continuar? s-sim");
           String opcao = new Scanner(System.in).next();
           System.out.println(opcao.equalsIgnoreCase("s"));
           continuar = (opcao.equalsIgnoreCase("s"));            
       }
       System.out.println("fim do programa");
   }
   
   static void loops() {
       /*System.out.print("Informe nota: ");
       float nota1 = new Scanner(System.in).nextFloat();
       
       System.out.print("Informe nota: ");
       float nota2 = new Scanner(System.in).nextFloat();
       
       System.out.print("Informe nota: ");
       float nota3 = new Scanner(System.in).nextFloat();
       
       System.out.print("Informe nota: ");
       float nota4 = new Scanner(System.in).nextFloat();*/
       int x = 1; //variavel controle
       float soma = 0;
       int nNotas = 4;
       while(x <= nNotas) {            
           System.out.print("Informe nota: ");
           float nota = new Scanner(System.in).nextFloat();            
           soma = soma + nota;
           System.out.println(soma);
           System.out.println(x);
           x=x+1;
       }
       
       float media = soma/nNotas;
       System.out.println(media);
       System.out.println("fim do programa");

   }

   
}