
public class Aula7 {

	 public static void main(String[] args) {
	        ola("Maria");
	       /* soma(30, 50);
	        soma(100, 345);
	        int retorno = subtracao(100, 10);
	        System.out.println("Retorno: " + retorno);
	       
	        int[] numeros = {1, 4, 5, 6};
	        listarArray(numeros);
	       
	        int[] numeros2 = {100, 400, 500, 600,800,900,1000};
	        listarArray(numeros2);
	        int[] array1 = {1, 2, 3, 4};
	        int[] arrayRetorno = novoArray(array1);
	        listarArray(arrayRetorno);*/
	    }
	   
	   
	    static void listarArray(int[] arr) {
	        for(int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }
	   
	    static int[] novoArray(int[] arr) {
	        int[] arrayLocal = new int[arr.length];
	        for(int i = 0; i < arr.length; i++) {
	           arrayLocal[i] = arr[i] * 2;    
	        }
	        return arrayLocal;
	    }
	   
	    static void ola(String pNome) {
	          System.out.println("Ola " + pNome);    
	        }
	       
	        static void soma(int n1, int n2) {
	            int resultado = n1 + n2;
	            System.out.println("Resultado: " + resultado);
	        }
	       
	        static int subtracao(int n1, int n2) {
	            int resultado = n1 - n2;
	            return resultado;
	        }
	       

	}