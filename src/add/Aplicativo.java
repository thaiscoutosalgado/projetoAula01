package add;
import java.util.Scanner;
import entidade.Telefone;
import entidade.Cliente;
public class Aplicativo {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Telefone f = new Telefone();
		Scanner  scan = new Scanner(System.in);
		
		
		System.out.print("Informe o ID: ");
		c.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o Nome:");
		c.setNome(scan.nextLine());
		System.out.print("Informe a Idade: ");
		c.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o Id do telefone: ");
		f.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		f.setNumero(scan.nextLine());
		scan.close();
		System.out.println("\nO ID informado foi: " + c.getId());
		System.out.println("O NOME informado foi: " + c.getNome());
		System.out.println("A IDADE informada foi: " + c.getIdade());
		System.out.println("O ID do telefone informado foi: " + f.getId());
		System.out.println("O Numero informado foi: " + f.getNumero());
	}
}


