package implement;
import java.sql.SQLException;
import entidade.Caixa;
import persistencia.CaixaDAO;

public class CaixaDAOImp {
	private CaixaDAO dao = null;
	
	public CaixaDAOImp() {
		dao = new CaixaDAO();
	}
	
	public Boolean salvar(Caixa a){
		try {
			dao.save(a);
			return Boolean.TRUE;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}