package exercicio;

import java.util.Scanner;

public class Ex05 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int inverte = 0;
		int etapa = 1;

		System.out.print("Digite um n�mero de 3 digitos: ");
		numero = scan.nextInt();

		scan.close();

		while (numero > 0) {
			System.out.println("Etapa: " + etapa);
			inverte *= 10;
			System.out.println("*= " + inverte);
			inverte += (numero % 10);
			System.out.println("+= " + inverte);
			numero /= 10;
			System.out.println("/= " + numero + "\n----------------");
			etapa++;
		}

		System.out.print("O n�mero invertido �: " + inverte);
	
		
	}
}
