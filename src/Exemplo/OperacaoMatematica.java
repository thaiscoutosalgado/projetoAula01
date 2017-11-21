package Exemplo;

public class OperacaoMatematica {
	public static void main(String[] args) {
		
		int x = 5;
		int y;
		
		y = x++;
		System.out.println("saída: \nx: " + x + "\ny: " + y);
		y= ++x;
		
		System.out.println("saída: \nx: " + x + "\ny: " + y);
	}

}
