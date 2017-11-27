package entidade;

public class Produto {
	
 private Long id;
 private String nmProduto;
 private Double quantidade;
 private Double preco;
 
 public Produto() {
	 
 }
 
 public String totString() {
	 return "ID:" + id + "\tNome: " + nmProduto + "\tQauntidade: " + quantidade + "\tPreço: "+ preco; 
 }
 
 public Long getId() {
	return id; 
 }
 
 public void setId(Long id) {
	 this.id = id;
 }
 
 public String getNmproduto() {
	 return nmProduto;
 }
 
 public void setNmproduto(String nmProduto) {
	 this.nmProduto = nmProduto;
 }
 public Double getQauntidade() {
	 return quantidade;
 }
 public void setQuantidade(Double quantidade) {
	 this.quantidade = quantidade;
 }
 public Double getPreco() {
	 return preco;
 }
 public void setPreco(Double preco) {
	 this.preco =  preco;
 }

}
