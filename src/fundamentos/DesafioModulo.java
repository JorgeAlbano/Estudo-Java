package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite o Primeiro número: ");
		String PrimeiroNumero = entrada.next();
		
		System.out.println(" Digite o Segundo número: ");
		String SegundoNumero = entrada.next();
		
		System.out.println(" Digite o simbolo da operação número: ");
		String Simbolo = entrada.next();
		
		double numero1 = Double.parseDouble(PrimeiroNumero);
		double numero2 = Double.parseDouble(SegundoNumero);
		
		double resultado;
		
			if (Simbolo.equals("+")) {
				resultado = numero1 + numero2;
				System.out.println("O resultado é: " + resultado);
			}
			else if (Simbolo.equals("-")) {
                resultado = numero1 - numero2;
                System.out.println("O resultado é: " + resultado);
                
			}
            else if (Simbolo.equals("*")) {
                    resultado = numero1 * numero2;
                    System.out.println("O resultado é: " + resultado);
            }
            else if (Simbolo.equals("/")) {
                    resultado = numero1 / numero2;
                    System.out.println("O resultado é: " + resultado); 
            } 
			
	entrada.close();
	}

}
