package exercicio;
/*8.	Um ano é bissexto se for divisível por 4 e não for divisível por 100. Também são bissextos os divisíveis por 400. Desenvolva um programa para determinar se um ano informado é bissexto.*/
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano;
		System.out.print("Digite o ano: ");
		ano = scan.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0)||(ano % 400 == 0)) {
			System.out.println("O ano é bissexto");
		}
		else {
			System.out.println("O ano não é bissexto");
		}
	}
}
