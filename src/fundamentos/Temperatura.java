package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		
		double valor = 50;
		
		double ajuste = 32;
		double fator = 5.0/9.0;
		double C = (valor - ajuste) * fator;
		
			System.out.println(" A temperatura em C é " + C);
		
		
		
		
	}

}
