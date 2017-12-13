package EX05;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {

		int numero;

		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("Informe um numero: ");

			numero = scan.nextInt();

			for (int i = 0; i <= 10; i++) {
				System.out.println("A soma do numero é: " + (i + numero));

			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
				
				System.out.println("A subtração do numero é: " + (i - numero));
			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
				
				System.out.println("A multiplicaçãodo numero é: " + (i * numero));
			}
			System.out.println("");
			for (int i = 0; i <= 10; i++) {
			
				System.out.println("A divisão numero é: " + (i / numero));
			}

		}

	}

}
