package exercicio;
import java.util.Scanner;

/*6.	Desenvolva um programa para ler dois valores inteiros e apresentar a adi��o destes valores quando o x > y, caso contr�rio, deve ser efetuado a multiplica��o deles.

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
			System.out.println("A soma dos numeros s�o: " +(x + y));
		}
		else {
			System.out.println("A Multiplica��o � de: " + (x * y));
		}
	}
}
