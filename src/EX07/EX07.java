package EX07;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		int l1;
		int l2;
		int l3;
		int l4;
		
		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("Informe um lado do quadrado: ");
			l1 = scan.nextInt();
			System.out.print("Informe o segundo lado do quadrado: ");
			l2 = scan.nextInt();
			System.out.print("Informe o terceiro lado do quadrado: ");
			l3 = scan.nextInt();
			System.out.print("Informe o quarto lado do quadrado: ");
			l4 = scan.nextInt();
			
			if ((l1 == l2) && (l3 == l4)) {
				System.out.println("é um quadrado perfeito");
			}else {
				System.out.println("não é um quadrado perfeito");
			}
		}
	}
}
