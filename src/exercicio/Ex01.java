package exercicio;

import java.util.Scanner;
public class Ex01 {
	
	/*1.	Desenvolva um programa para efetuar a leitura de um valor 
	 * inteiro positivo ou negativo e apresentar o número lido como 
	 * sendo um valor positivo, ou seja, o programa deverá 
	 * apresentar o módulo de um número fornecido.*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valor;
		System.out.print("Digite Um número: ");
		valor = scan.nextDouble();
		scan.close();
		if(valor < 0) {
			System.out.println("O modulo do valor é de: " +      valor*(-1));
		}else {
			System.out.println("o valor digitado é de:" +  valor);
		}
		
		
	}
}
