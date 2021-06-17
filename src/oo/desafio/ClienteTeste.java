package oo.desafio;

public class ClienteTeste {
	
		public static void main(String[] args) {
			
			Cliente compra1 = new Cliente();
			compra1.nomeCliente = "Jorge";
			
			compra1.itens.add(new Item("Lapis", 12, 4.00));                                                                                              
			compra1.itens.add(new Item("Caneta", 6, 2.50));
			
			System.out.println(compra1.nomeCliente + " ----- > Gastou " + compra1.obterValorTotal());
			
			
		}

}
