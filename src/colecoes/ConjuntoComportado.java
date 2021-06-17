package colecoes;

import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>();
		
		TreeSet<String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Joaquim");
		listaAprovados.add("Pedro");
		listaAprovados.add("Joana");
		listaAprovados.add("Kiko");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		
		
		}
	}

}
