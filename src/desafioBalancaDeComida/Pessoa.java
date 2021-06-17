package desafioBalancaDeComida;

public class Pessoa {

		String nome;
		double peso;
		double pesoTotal;
		
		Pessoa ( String nome, double peso){
			this.nome = nome;
			this.peso = peso;
			
		}
			
		void comer(Comida comida) {
			if (comida != null) {
				this.peso += comida.pesoComida;
				
			}
		}
		
		String apresentar() {
			return " Sou o " + nome + " e tenho " + peso + " Kgs.";
			
		}
					
			
		
}
