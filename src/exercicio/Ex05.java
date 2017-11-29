package exercicio;


import java.util.Scanner;
/*5.	Escreva um programa para que leia um número e verifique se ele se encontra no intervalo entre 5 e 20.
*/
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = scan.nextInt();
		
		if ((n > 5) && (n<20)) {
			System.out.println("o numero está entre 5 e 20: " + n);
		}
	}
}
