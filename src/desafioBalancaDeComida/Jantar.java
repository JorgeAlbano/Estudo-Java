package desafioBalancaDeComida;

public class Jantar {

		public static void main(String[] args) {
			
			
			Comida c1 = new Comida("Arroz", 0.200);
			Comida c2 = new Comida("Feij�o", 0.100);
			
			Pessoa p = new Pessoa("Jo�o", 74.0);
			
			System.out.println(p.apresentar());
			p.comer(c1);
			
			System.out.println(p.apresentar());
			p.comer(c2);
			
			System.out.println(p.apresentar());
			
			
				
			
				
				
			
			
			
		}
}
