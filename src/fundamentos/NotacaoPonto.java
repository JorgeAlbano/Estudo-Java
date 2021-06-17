package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
	
		String s = "Bom dia Vagabundo";
		s = s.replace("Vagabundo", "desculpa senhor");
		//faz trocar a palavra por outra
		
		s = s.toUpperCase();
		//Faz deioxar a palavra minuscula em maiuscula
		
		s = s.concat(", toma");
		// Concatena igual o sinal de +
		
		System.out.println(s);
		
		String z = "Bom dia X".replace("X", "VAgabundo").toUpperCase().concat("sem vergonha");
		// Voce pode usar juntos os metodos separando apenas com ponto
		
		System.out.println(z);
		
	}

}
