package entidade;

public class Caixa extends Usuario {
	
	
	private Integer senha;
	private String cargo;

	public Caixa() {
	}
	@Override
	public String toString() {
		return "\n\tSenha: " + senha + ", \n\tCargo: " + cargo ;
	}
	public int getSenha() {
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
