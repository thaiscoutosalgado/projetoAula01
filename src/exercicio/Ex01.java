package exercicio;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("A Soma dos valores � :" + (n1 + n2));
		System.out.println("A Subtra��o dos valores � :" + (n1 - n2));
		System.out.println("A Multiplica��o dos valores � :" + (n1 * n2));
		System.out.println("A Divis�o dos valores � :" + (n1 / n2));
	}
}
