package oo.desafio;

import java.util.ArrayList;

public class Cliente {

		String nomeCliente;
		
		ArrayList <Compra> compra = new ArrayList<>();
		ArrayList<Item> itens = new ArrayList<>();
		
		double obterValorTotal() {
			double total = 0;
						
			for(Item item: itens) {
				total += item.quantidadeProduto * item.p1.preco;
			}
			return total;
			
		
		}
		
}
