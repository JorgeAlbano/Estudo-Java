package heranca.desafio;

public class Carro {

	int velocidadeInicial = 0;
	
	boolean acelerar () {
		if(velocidadeInicial > 0)  {
			velocidadeInicial++;
			return true;	
		}
		else { 
			return false;
		}
	}
	
	boolean frear () {
		if(velocidadeInicial > 0) {
			velocidadeInicial--;
			return true;
		} else {
			return false;
		}
	}	
}
