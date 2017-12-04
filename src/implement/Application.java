package implement;

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
