package entidade;

public class Usuario {
	
	private Long id;
	private String nome;
	private Integer matricula;
	
	public Usuario() {
	}
	
	@Override
	public String toString() {
		
		return "ID: " + id + ", \n\tNome: " + nome;
	}
	
	public Long getId() {
		return id;
	
	}
	public void setId(Long id) {
		this.id = id;
	
	}
	public String getNome() {
		return nome;
	
	}
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public Integer getMatricula() {
		return matricula;
		
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
		
	}
}