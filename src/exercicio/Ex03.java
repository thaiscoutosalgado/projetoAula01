package exercicio;

import java.util.Scanner;

/*3.	Implemente um programa que leia dois valores inteiros e verificar se o primeiro � m�ltiplo do segundo, seu programa dever� exibir a mensagem: �S�o m�ltiplos� ou �N�o s�o m�ltiplos� dependendo da condi��o. */
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
			System.out.println("Os valores s�o M�ltiplos");
		}
		else {
			System.out.println("Os valores n�o s�o M�ltiplos");
		}
	}

	
	
}
