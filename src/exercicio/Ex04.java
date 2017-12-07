package exercicio;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int vet[] = new int[3];
		
		System.out.print("Digite um número: ");
		vet[0] = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		vet[1]= scan.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		vet[2] = scan.nextInt();
		
		scan.close();
		
		for (int i = 0; i < vet.length; i++) {
		    for (int j = 0; j < vet.length - 1; j++) {
		        if (vet[j] < vet[j + 1]) {
		            int temp = vet[j];
		            vet[j] = vet[j + 1];
		            vet[j + 1] = temp;
		        }
		    }
		}
		for (int i : vet) {
			System.out.println("" + i);
		}
	}
}
