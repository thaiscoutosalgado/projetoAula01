package entidade;

public class Cliente extends Pessoa {

	private String telefone;
	private FormaPagamento formapagemento;
	private Tipo tipo;
	
	public Cliente() {
		
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public FormaPagamento getFormapagemento() {
		return formapagemento;
	}
	public void setFormapagemento(FormaPagamento formapagemento) {
		this.formapagemento = formapagemento;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public enum FormaPagamento{
		
		BOLETO, CARTAO;
		
		 String getPagamento() {
			 switch (this) {
			 case BOLETO:
			 	return ("Boleto");
			 case CARTAO:
				 return ("Cartão");
			default:
				throw new AssertionError("Forma de Pagamento Incorreto" + this);
			 }
		 }
	}
	
	public enum Tipo {
		PESSOA_FISICA, PESSOA_JURIDICA;
	}
}
