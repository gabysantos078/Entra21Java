public class Aula3 {

	public static void main(String[] args) {
		//operadorLogicoAnd();
	       operadorLogicoOU();

	   }
	   
	   /* usando OU
	    * V V = V
	    * V F = V
	    * F V = V
	    * F F = F
	    * */
	   
	   static void operadorLogicoOU() {
	       float media = 6;
	       float frequencia = 70;
	       
	       System.out.println(media >= 7);
	       System.out.println(frequencia >= 75);
	       
	       /*if(media >= 7 || frequencia >= 75) {
	           System.out.println("Aprovado");
	       }*/
	       
	       if(media < 7 || frequencia < 75) {
	           System.out.println("Reprovado");
	       }
	       else {
	           System.out.println("Aprovado");
	       }
	           
	   }

	   /* usando &&
	    * V V = V
	    * V F = F
	    * F V = F
	    * F F = F
	    * */
	   static void operadorLogicoAnd() {
	       float media = 6;
	       float frequencia = 70;
	       
	       System.out.println(media >= 7);
	       System.out.println(frequencia >= 75);
	       
	       if(media >= 7 && frequencia >= 75) {
	           System.out.println("Aprovado");
	       }
	   }
	}