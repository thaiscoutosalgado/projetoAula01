package EX08;

import java.util.Scanner;

/*8.	Faça um programa para ler vários números e informar quantos números entre 100 e 2000 foram digitados e quantos são divisores de 3, quantos são de 11 e quantos de 15. Se o valor digitado for 0 o programa deve ser encerrado.*/
public class EX08 {
	public static void main(String[] args) {
		int y = 1; // Chama a parada do programa quando digitado o numero 0.
		int cont1 = 0; // conta os numeros entre 100 e 2000.
		int cont2 = 0; // conta os numeros entre 100 e 2000 e multiplos de 3.
		int cont3 = 0; // conta os numeros entre 100 e 2000 e multiplos de 11.
		int cont4 = 0; // conta os numeros entre 100 e 2000 e multiplos de 15.
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("DIGITE UM NUMERO (OU ZERO PARA PARAR):  ");
			y = scan.nextInt();
			
			if ((y > 99) && (y < 2001)){
				cont1 = 0;
				cont1 = cont1 + y;
				System.out.println(cont1);
				
				if (cont1 % 3 == 0){
					System.out.println(cont1 + " --> MULTIPLO DE 3");
				}
				
				else if (cont1 % 11 == 0){
					System.out.println(cont1 + " --> MULTIPLO DE 11");
				}
				
				else if (cont1 % 15 == 0){
					System.out.println(cont1 + " --> MULTIPLO DE 15");
				}
			}
		}while (y != 0);
		
		
	}
}
				
	

