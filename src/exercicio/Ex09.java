package exercicio;
/*9.	Desenvolva um programa para ler o numerador e denominador de uma divis�o e realiza-la verificando a �divis�o por zero�.*/
import java.util.Scanner;
public class Ex09 {
	 public static void main(String[] arg) {
		 Scanner scan = new Scanner(System.in);
		    int numerador;
			int denominador;
			
			System.out.print("Digite o numerador: ");
			numerador = scan.nextInt();
			
			
			System.out.print("Digite o denomidador: ");
			denominador = scan.nextInt();
			
			if(denominador == 0 ) {
				System.out.println("Erro no c�digo");
			}
			else {
				System.out.println("a divis�o � de:" + (numerador / denominador));
			}
	 }
}
