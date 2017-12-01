package entidade;


public class funcionario<Cargo>  extends Pessoa{

	private Double salario;
	private String setor;
	private Cargo cargo;
	
	public funcionario() {
		// TODO Auto-generated constructor stub
	}

	public funcionario(Double salario, String setor, Cargo cargo) {
		super();
		this.salario = salario;
		this.setor = setor;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "funcionario [salario=" + salario + ", setor=" + setor + "]";
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public enum Cargo{
		SECRETARIA, ANALISTA, DIRETOR, GERENTE;
	
	}
}
