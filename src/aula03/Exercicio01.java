package aula03;

import java.util.Scanner;

public class Exercicio01 {
		public static void main(String[] args) {
			
			
			//calcular o desconto de 9% em um valor qualquer
			
			Double preco;
			Double desconto;
			Double resul;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite o valor do objeto: ");
			preco = scan.nextDouble();
			scan.close();
			
			 desconto = (preco * 0.09);
			 resul = (preco - desconto);
			 
			 
			System.out.println("O desconto foi de: " + resul);
			
		}
}
