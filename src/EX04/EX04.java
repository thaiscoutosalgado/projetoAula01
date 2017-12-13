package EX04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX04 {
	
		public static void main(String[] args) {

			double l1, l2, l3;
			int aux, equilatero = 0 , isosceles = 0, escaleno = 0;
			
			
			Scanner scan = new Scanner(System.in);
			
			do {
			
			System.out.println("Isira a medida do primeiro lado do triangulo: ");
			l1 = scan.nextDouble();
			
			System.out.println("Isira a medida do segundo lado do triangulo: ");
			l2 = scan.nextDouble();
			
			System.out.println("Isira a medida do terceiro lado do triangulo: ");
			l3 = scan.nextDouble();
			
			System.out.println("Medir outro triangulo? (PRESSIONE 0 PARA SAIR OU 1 PARA CONTINUAR) ");
			aux = scan.nextInt();
			
			
				if (l1 == l2) {
					if (l2 == l3) {
						equilatero = equilatero + 1;
					}
					else {
						isosceles = isosceles + 1;					
					}			
				}
				else {
					if (l2 == l3){
						isosceles = isosceles + 1;
					}
					else {
						escaleno = escaleno + 1;
						
					}
				}
			} while ( aux == 1);
			
			
		}

	}
	
