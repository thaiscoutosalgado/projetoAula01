package app;

import java.util.Scanner;
import heran�a.Aluno;
public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		System.out.print("Informe o email do aluno: ");
		aluno.setEmail(scan.nextLine());
		System.out.print("Informe o telefone do aluno: ");
		aluno.setTelefone(scan.nextLine());
		System.out.print("Informe o matricula do aluno: ");
		aluno.setMatricula(Long.parseLong(scan.nextLine()));
		System.out.print("Informe a 1� nota do aluno: ");
		aluno.setNota01(Double.parseDouble(scan.nextLine()));
		System.out.print("Informe a 2� nota do aluno: ");
		aluno.setNota02(Double.parseDouble(scan.nextLine()));
		
		scan.close();
		
		System.out.println(aluno);
	}

}
