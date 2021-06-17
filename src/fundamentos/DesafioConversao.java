package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite o salário de Janeiro: ");
		String SalarioJaneiro = entrada.next().replace(",",".");
		
		System.out.println(" Digite o salário de Fevereiro: ");
		String SalarioFevereiro = entrada.next().replace(",",".");
		
		System.out.println(" Digite o salário de Março: ");
		String SalarioMarco = entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(SalarioJaneiro);
		double salario2 = Double.parseDouble(SalarioFevereiro);
		double salario3 = Double.parseDouble(SalarioMarco);
		
		double soma = salario1 + salario2 + salario3;
		System.out.println(" A média de Salário é de " + soma/3);
		
		entrada.close();
	}

}
