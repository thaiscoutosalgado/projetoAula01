package exercicio;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int A;
		int B;
		
		System.out.print("Digite o valor de A: ");
		A = scan.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = scan.nextInt();
		
		System.out.println("O novo valor de A �: " + (B));
		System.out.println("O novo valor de B �: " + (A));
	}
}
