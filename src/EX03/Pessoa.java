package EX03;

public class Pessoa {

	private String sexo;
	private String corOlhos;
	private String corCabelo;
	private int idade;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String sexo, String corOlhos, String corCabelo, int idade) {
		this.sexo = sexo;
		this.corOlhos = corOlhos;
		this.corCabelo = corCabelo;
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}

	public String getCorCabelo() {
		return corCabelo;
	}

	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	
}
