package exercicio;
/*7.	Efetuar a leitura de dois números inteiros e apresentar a relação existente entre eles, ou seja:
a.	O primeiro é maior que o segundo
b.	São iguais
c.	O segundo maior que o primeiro
*/
import java.util.Scanner;
public class Ex07 {
	
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
			System.out.println("O primeiro é maior que o segundo");
			
		}else if (x < y) {
			System.out.println("O segundo é maior que o primeiro");
		}
		else {
			System.out.println("São iquais");
		}
	}
}
