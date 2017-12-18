package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidade.Administrador;

public class AdministradorDAO extends ConnectionDAO{
	private Connection conn = null;

	public AdministradorDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao Abrir a conexão: " + e.getMessage());
		}
	}

	// método responsavelpor salvar o aluno no banco de dados
	public void save(Administrador a) throws SQLException {
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("insert into usuario values(null, ?, ?, ?, ?, ?)");
			
			stmt.setDouble(1, a.getId());
			stmt.setInt(2, a.getMatricula());
			stmt.setString(3, a.getNome());
			stmt.setInt(4, a.getSenha());
			stmt.setString(5, a.getCargo());
			
			int flag = stmt.executeUpdate();

			if(flag == 0)
				throw new SQLException("Erro ao graver no banco");
			
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();

		}
	}
}
