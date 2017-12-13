package EX09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*9.	Escrever um programa, que leia valores inteiros até ser lido o valor -1. Quando isso acontecer o programa deverá escrever a soma e a média dos valores lidos.*/
public class EX09 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		int numero;
		double soma = 0;
		// auto fechamneto so Scanner 
		try (Scanner scan = new Scanner(System.in)){
			for (;;) {
				System.out.print("Informe em número ou 0 para parar: ");
				
				numero = scan.nextInt();
				
				
				if(numero == -1) { 
					break;
				}
				numeros.add(numero);
				
				
				soma += numero;
			}
			
		
			System.out.println("\nSoma: " + soma);
			
			System.out.println("\nMedia: " + soma/numeros.size());
			
		}
	}
}
