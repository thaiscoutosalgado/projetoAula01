package exercicio;
/*8.	Um ano � bissexto se for divis�vel por 4 e n�o for divis�vel por 100. Tamb�m s�o bissextos os divis�veis por 400. Desenvolva um programa para determinar se um ano informado � bissexto.*/
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano;
		System.out.print("Digite o ano: ");
		ano = scan.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0)||(ano % 400 == 0)) {
			System.out.println("O ano � bissexto");
		}
		else {
			System.out.println("O ano n�o � bissexto");
		}
	}
}
