package entidade;

import java.util.List;
public class Compra {

	private Long id;
	private Empregada empregada;
	private List<Produto> listaDeprodutos;
	
	public Compra() {
		//TODO Auto-generated construtor stub
	}
	
	@Override
	public String toString() {
		return "Compra:\nID: " + id + "\nEmpregada: " + empregada + "\nLista de produtos:\n" + listaDeprodutos;
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Empregada getEmpregada() {
		return empregada;
		
	}
	
	public void setEmpregada( Empregada empregada) {
		this.empregada = empregada;
	}
	
	public List<Produto> getListaDeProdutos(){
		return listaDeprodutos;
	}
	
	public void setListaDeProdutos(List<Produto> listaDeprodutos) {
		this.listaDeprodutos = listaDeprodutos;
	}
	
}
