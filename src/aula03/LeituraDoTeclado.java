package aula03;

import java.util.Scanner;

public class LeituraDoTeclado {
  public static void main(String[] args) {
	  
	int numero;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite um numero: ");
	numero = teclado.nextInt();
	teclado.close();
	
	System.out.println("\nNúmero lido: " + numero);
  }
}
