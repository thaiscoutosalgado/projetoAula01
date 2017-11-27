package exemplo;
import java.util.ArrayList;
import java.util.List;
import entidade.Produto;
public class Listas {
 
	public static void main(String[] args) {
		
		//primeiro contato com collections
		
		/*Declaração do objeto*/
		Produto lc1 = new Produto();
		Produto lc2 = new Produto();
		Produto lc3 = new Produto();
		
		
		/*Declarando uma lista*/
		
		List<Produto> lista = new ArrayList<Produto>();
		
		
		lc1.setId(10L);
		lc1.setNmproduto("Arroz");
		lc1.setPreco(10.5);
		lc1.setQuantidade(2.5);
		
		lc2.setId(20L);
		lc2.setNmproduto("Feijão");
		lc2.setPreco(7.8);
		lc2.setQuantidade(1.);
		
		lc3.setId(30L);
		lc3.setNmproduto("Açucar");
		lc3.setPreco(30.);
		lc3.setQuantidade(5.);
	}
}
