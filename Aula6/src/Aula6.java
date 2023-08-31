
public class Aula6 {

	public static void main(String[] args) {
		String nome;
		nome = "Ana";
		nome = "José";
		
		//forma 1
		
		int [] megasena = {10, 12, 25, 36, 45, 32};

		//forma2
		
		int[] sorteio = new int [6];
		
		//array unidimensional
		String[] nomes = {"Ana", "José", "Pedro"};
		//System.out.println("nomes [0]");
		//nomes[0] = "Ana Maria"; //atribuição ao "ana" -> Ana Maria
		//System.out.println(nomes[2]);
		//System.out.println(nomes.length);
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
