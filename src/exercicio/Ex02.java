package exercicio;
import java.util.Scanner;
public class Ex02 {
	/*2.	Elabore um algoritmo para ler um valor inteiro e informar, através de uma mensagem se este valor é um número par ou ímpar.*/
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer valor;
		
		
		System.out.print("Digite um Valor: ");
		valor = scan.nextInt();
		
		scan.close();
		
		if ( valor % 2 == 0) {
			System.out.println("O valor Digitado é par: " + valor);
		}
		else {
			System.out.println("O valor Digitado é ímpar: " +valor);
		}
		
	}
}
