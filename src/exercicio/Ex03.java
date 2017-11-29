package exercicio;

import java.util.Scanner;

/*3.	Implemente um programa que leia dois valores inteiros e verificar se o primeiro é múltiplo do segundo, seu programa deverá exibir a mensagem: “São múltiplos” ou “Não são múltiplos” dependendo da condição. */
public class Ex03 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Integer n1;
		Integer n2;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = scan.nextInt();
		System.out.print("Digite o segundo Valor: ");
		n2 =scan.nextInt();
		
		scan.close();
		
		if(n1 % n2 == 0) {
			System.out.println("Os valores são Múltiplos");
		}
		else {
			System.out.println("Os valores não são Múltiplos");
		}
	}

	
	
}
