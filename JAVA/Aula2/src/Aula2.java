import javax.swing.JOptionPane;

public class Aula2 {

	public static void main(String[] args) {
		//entradaDadosComJOptionPane();
		//conversaoDeTipos();
		//desvioCondicional();
		
	}
	
	static void desvioCondicional() {
		int x = 40;
		int y = 20;
		//testes lógicos com operadores de comparação
		/*System.out.println(x < y);
		System.out.println(10< 20);
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x == y);
		System.out.println(x != y);*/
		
		if(x < y) {
			System.out.println(x + " é menor que " + y);
		}
		else {
			System.out.println("Não é menor");
		}
	}

	static void entradaDadosComJOptionPane() {
		String nome = JOptionPane.showInputDialog("Informe nome");
		JOptionPane.showMessageDialog(null, nome);
		
	}

 	static void conversaoDeTipos() {
 		String nome = JOptionPane.showInputDialog("Informe nome");
		JOptionPane.showMessageDialog(null, nome);
		
		//Converter String para inteiro
				
		String idadeString = JOptionPane.showInputDialog("Informe idade ");
		int idade = Integer.parseInt(idadeString);
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe altura "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe peso "));
				
		String msg = "";
		msg = "Seu nome é: " + nome;
		msg = msg + ", idade: " + idade;
		msg = msg + ", altura" + altura;
		msg = msg + ", peso" + peso;
				
		JOptionPane.showMessageDialog(null, msg);
	
		
		
	}

	
}