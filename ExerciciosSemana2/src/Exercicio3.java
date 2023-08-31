import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um programa que receba 5 números inteiros, após isso mostre o array ordenado em ordem crescente.*/
		
		exercicio1 ();
		//exercicio1ComUser (); //corrigir

	}
	static void exercicio1 () {
		
		int[] numeros = {3, 8, 12, 5}; 
		int vezes = 0;
		
		boolean trocar = true;
		while(trocar) {
			trocar = false;
				for(int i = 0; i < numeros.length - 1; i++) {
					if(numeros[i] > numeros[i + 1]) {
					int auxiliar = numeros [i];
					numeros[i] = numeros[i + 1];
					numeros[i+1] = auxiliar;
					
					trocar = true;
				}
			} 
				
				vezes++;
		}
		//imprimir array
		int x = 0;
		while(x < numeros.length) {
			System.out.println(numeros[x]);
			x++;
	}
		System.out.println("Vezes: " + vezes);
 }

	static void exercicio1ComUser () {
		int[] numeros = new int[5]; 
		int auxiliar = 0;
		
				
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Insira os valores inteiros desejados: ");
			numeros [i] = new Scanner(System.in).nextInt();
			
			for(int j = 0; j < numeros.length; j++) {
				
				if(numeros[j] > numeros[j + 1]) {
					auxiliar = numeros [j];
					numeros[j] = numeros[j + 1];
					numeros[j+1] = auxiliar;
				}
			} 
				
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("" + numeros[i]);
	}
 }

}
