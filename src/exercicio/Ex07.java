package exercicio;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		String txtNumero;
		int numero;
		int contador;

		txtNumero = JOptionPane.showInputDialog("Informe um n�mero");
		numero = Integer.parseInt(txtNumero);
		contador = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				contador++;
		}
		if (contador == 2) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � primo");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " n�o � primo");
		}
	}
}
