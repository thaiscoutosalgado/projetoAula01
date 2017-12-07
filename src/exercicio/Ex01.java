package exercicio;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("A Soma dos valores é :" + (n1 + n2));
		System.out.println("A Subtração dos valores é :" + (n1 - n2));
		System.out.println("A Multiplicação dos valores é :" + (n1 * n2));
		System.out.println("A Divisão dos valores é :" + (n1 / n2));
	}
}
