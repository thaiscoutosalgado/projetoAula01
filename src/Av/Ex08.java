package Av;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 Double Saldo;
		 
		 System.out.print("Digite seu saldo: ");
		 Saldo = scan.nextDouble();
		 
		 if (Saldo <= 200 ) {
			 System.out.println("nenhum crédito");
		 }
		 else if( Saldo <= 400) {
			  System.out.println("20% do valor do saldo médio: " + ((Saldo * 0.20)+ Saldo));
		 }
		 else if (Saldo <= 600) {
			 System.out.println("30% do valor do saldo médio: " + ((Saldo * 0.30)+ Saldo));
		 }else {
			 System.out.println("40% do valor do saldo médio: " + ((Saldo * 0.40)+ Saldo));
		 }
	}
}
