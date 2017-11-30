package herança;

public class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	//ctrl + espaço
	public Pessoa() {
		
	}
	//alt + shift + s + o 
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	//alt + shift + S + S 
	public String toString() {
		return "Nome: " + nome + "\t\nEmail: " + email + "\t\nTelefone: ";
		
	}
	//alt + shit + S + R
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
}
