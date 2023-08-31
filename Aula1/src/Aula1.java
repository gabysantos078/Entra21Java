import java.util.Scanner;
public class Aula1 {

	public static void main(String[] args) {
		// variaveis();
		//entradaDigitadaPeloUsuario();
		
	}
	
	//notação camelCase
	static void entradaDigitadaPeloUsuario() {
		System.out.print("Informe Nome: ");
		String nome;
		nome = new Scanner(System.in).next();
		
		int idade;
		float altura;
		double peso;
		
		
		
		System.out.print("Informe idade: ");
		idade = new Scanner(System.in).nextInt();
		
		
		System.out.print("Informe altura: ");
		altura = new Scanner(System.in).nextFloat();
		
		
		System.out.print("Informe peso: ");
		peso = new Scanner(System.in).nextDouble();
		
		System.out.print("Seu nome " + nome + " tem " + idade + " anos ");
		
	}
	
	
 static void variaveis() {
	System.out.println("Hello World");
			
			//variavel
			String nome = "Gabriely";
			System.out.println(nome);
			
			//atribuições
			nome = "Gaby";
			System.out.println(nome);
			
			int idade = 21;
			System.out.println(idade);
			
			float altura = 1.65f;
			System.out.println(altura);
			
			double peso = 70;
			System.out.println(peso);
}
}