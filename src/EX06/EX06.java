package EX06;

public class EX06 {

	public static void main(String[] args) {
		int x;
		int y;
		int z = 0;
		int somapar = 0;
		int somaimpar = 0;
		
		do {
			z = z + 1;
			System.out.print( z + ", ");
			if (z % 7 == 0) {
				System.out.println(" (MULTIPLO DE 7), ");	
			}
			else if (z % 2 == 0) {
				somapar = somapar + z;
			}
			else if (z % 2 != 0) {
				somaimpar = somaimpar + z;
			}
		} while (z != 100);
		
		System.out.println("");
		System.out.println("A soma dos numeros pares foi de " + somapar);
		System.out.println("A soma dos numeros impares foi de " + somaimpar);
	
	}
}
