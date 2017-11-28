package app;
import java.util.List;

import entidade.Compra;
import entidade.Produto;
public class DestruidorDeObjetos {

	public static void setNull(List<Compra> compras) {
		for (Compra compra : compras) {
			for (Produto produto :  compra.getListaDeProdutos()) {
			produto.setId(null);
			produto.setNmproduto(null);
			produto.setPreco(null);
			produto.setQuantidade(null);
			produto = null;
			}
			
			compra.setId(null);
			compra.setEmpregada(null);
			compra.setListaDeProdutos(null);
			compra = null;
			
		}
		
		//chama lixeira
		if(lixeiro())
			System.err.println("Objetos destruídos");		
	}

		//Sugere a JVM que execute o Garbage Collector ( lixeiro)
		private static  boolean lixeiro() {
			System.gc();
			return Boolean.TRUE;
		}
			
}
