package EX05;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {

		int numero;

		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("Informe um numero: ");

			numero = scan.nextInt();

			for (int i = 0; i <= 10; i++) {
				System.out.println("A soma do numero �: " + (i + numero));

			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
				
				System.out.println("A subtra��o do numero �: " + (i - numero));
			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
				
				System.out.println("A multiplica��odo numero �: " + (i * numero));
			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
			
				System.out.println("A divis�o numero �: " + (i / numero));
			}

		}

	}

}
