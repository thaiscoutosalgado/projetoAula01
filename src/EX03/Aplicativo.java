package EX03;

import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    float porcentagemFeminina;
	    int idade, maiorIdade, contPorcentagem, cont;
	    String sexo; 
	    String corOlhos; 
	    String corCabelos;

	    contPorcentagem = 0;
	    maiorIdade = 0;
	    cont = 0;

	    do {
	        cont++;
	        System.out.print("Informe o sexo:\n");
	        sexo = scan.nextLine();
	      
	        System.out.print("Informe a cor dos olhos:\n");
	        corOlhos = scan.nextLine();
	        System.out.print("Informe a cor dos cabelos:\n");
	        corCabelos = scan.nextLine();
	        System.out.print("Informe a idade:\n");
	        scanf("%d", &idade);
	        if ((strcmp (sexo,"feminino") == 0) && ((idade >= 18) && (idade <= 35)) && (strcmp (corOlhos,"verdes") == 0) && (strcmp (corCabelos,"louros") == 0)) {
	            contPorcentagem++;
	        }
	        if (idade > maiorIdade) {
	            maiorIdade = idade;
	        }
	    }
	    while (idade != -1);
	    printf("Maior idade: %d\n", maiorIdade);
	    porcentagemFeminina = (100 * contPorcentagem)/cont;
	   System.out.println("Porcentagem feminina com olhos verdes, cabelos louros que estão entre 18 e 35 anos: %.2f\n", porcentagemFeminina);
	}
}
