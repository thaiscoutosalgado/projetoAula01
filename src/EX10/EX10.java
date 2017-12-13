package EX10;

import java.util.Random;

import javax.swing.JOptionPane;

public class EX10 {
	public static void main(String[] args) {
		int jogador;
		int computador;

		// Exibe mensagem de boas vindas ao jogador
		JOptionPane.showMessageDialog(null, "Bem vindo Jogo de Adivinhação Senac!");
		// Resgata a resposta do jogador
		jogador = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero qualquer"));
		// Gera o valor random do computador
		computador = randInt(0, 2);

		JOptionPane.showMessageDialog(null, "Jogador: " + jogador + "\nComputador: " + computador, "Jokenpô",
				JOptionPane.INFORMATION_MESSAGE);
		
		switch (jogador) {
		case 0:
			switch (computador) {
			case 0:
				JOptionPane.showMessageDialog(null, "Empate", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			break;

		case 1:
			switch (computador) {
			case 0:
				JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Empate", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			break;

		case 2:
			switch (computador) {
			case 0:
				JOptionPane.showMessageDialog(null, "Computador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Jogador ganhou", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Empate", "Jokenpô", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção invalida", "Jokenpô", JOptionPane.WARNING_MESSAGE);
			break;
		}

	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;



	}
}
