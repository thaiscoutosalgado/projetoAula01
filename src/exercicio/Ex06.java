package exercicio;
import java.util.Scanner;

/*6.	Desenvolva um programa para ler dois valores inteiros e apresentar a adição destes valores quando o x > y, caso contrário, deve ser efetuado a multiplicação deles.

*/
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Digite o primeiro numero: ");
		x = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		y = scan.nextInt();
		
		scan.close();
		
		if (x > y) {
			System.out.println("A soma dos numeros são: " +(x + y));
		}
		else {
			System.out.println("A Multiplicação é de: " + (x * y));
		}
	}
}
