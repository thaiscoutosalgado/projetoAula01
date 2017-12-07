package exercicio;

import java.util.Scanner;

public class Ex06 {
	
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			Integer valor;
			
			
			System.out.print("Digite um Valor: ");
			valor = scan.nextInt();
			
			scan.close();
			
			if ( valor % 2 == 0) {
				System.out.println("O valor Digitado é par: " + valor);
			}
			else {
				System.out.println("O valor Digitado é ímpar: " +valor);
			}
			
		}
	}
 
