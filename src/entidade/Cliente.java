package entidade;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	//construtor
	public Cliente() {
		
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
}


