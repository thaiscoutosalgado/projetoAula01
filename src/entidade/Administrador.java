package entidade;

public class Administrador extends Usuario{
	
	private Integer senha;
	private String cargo;

	public Administrador() {
	}

	@Override
	
	public String toString() {
		return "\n\tSenha: " + senha + ", \n\tCargo: " + cargo ;
	}
	
	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}