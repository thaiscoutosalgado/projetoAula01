package aplicativo;
import entidade.Caixa;
import implement.CaixaDAOImp;

public class Application {
	public static void main(String[] args ) {
		Caixa caixa = new Caixa();
		
		caixa.setId((long) 01);
		caixa.setNome("joca");
		caixa.setMatricula(123);
		caixa.setSenha(123123);
		caixa.setCargo("Caixa");
		//chamada de objeto anonimo do AlunoDAOImp
		if (new CaixaDAOImp().salvar(caixa))
		System.out.println("DADOS GRAVADOS COM SUCESSO");
				else
				System.out.println("FALHA NA GRAVAÇÃO");
	}
}



/*
 * package implement;

import entidade.Aluno;

public class Application {

	public static void main(String[] args ) {
		
		Aluno aluno = new Aluno();
		
		aluno.setMatricula(2153);
		aluno.setNome("Thais");
		aluno.setEmail("salgadothais15@gmail.com");
		aluno.setNota01(8.);
		aluno.setNota02(10.);
		
		//chamada de objeto anonimo do AlunoDAOImp
		if (new AlunoDAOImp().salvar(aluno))
			System.out.println("DADOS GRAVADOS COM SUCESSO");
		else
			System.out.println("FALHA NA GRAVAÇÃO");
	}
}

 * 
 * 
 */