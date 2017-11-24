package entidade;

public class Telefone {

	
	private Integer id;
	private String numero;
	
	public Telefone() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public String getNumero() {
		return numero;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNumero ( String numero) {
		this.numero = numero;
	}
}
