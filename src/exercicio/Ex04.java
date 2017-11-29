package exercicio;
import java.util.Scanner;


/*4.	Desenvolva um programa para ler um valor inteiro e apresentar:
a.	Exibir a mensagem “número negativo” se n < 0.
b.	Exibir a mensagem “zero” se n = 0.
c.	Exibir a mensagem “número positivo” se n > 0.
*/
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor;
		
		System.out.print("digite um Número: ");
		valor = scan.nextInt();
		
		if (valor < 0 ) {
			System.out.println("NÚMERO NEGATIVO");
		}
		else if (valor == 0) {
			System.out.println("ZERO");
		}
		else {
			System.out.println("NÚMERO POSITIVO");
		}
	}
}
