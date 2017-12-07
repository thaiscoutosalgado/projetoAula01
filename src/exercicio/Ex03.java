package exercicio;

import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Integer valor;
		System.out.print("Digite um número: ");
		valor = scan.nextInt();
		scan.close();
		if(valor < 0) {
			System.out.println("O Valor Absoluto é:   " +      valor*(-1));
		}else {
			System.out.println("O valor Absoluto é: " +  valor);
		}
		
		
	}
}
