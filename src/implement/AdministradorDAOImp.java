package implement;
import java.sql.SQLException;
import entidade.Administrador;
import persistencia.AdministradorDAO;
public class AdministradorDAOImp {
	private AdministradorDAO dao = null;
	
	public AdministradorDAOImp() {
		dao = new AdministradorDAO();
	}
	
	public Boolean salvar(Administrador a) {
		try {
			dao.save(a);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}


