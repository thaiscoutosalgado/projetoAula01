package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entidade.Caixa;

public class CaixaDAO extends ConnectionDAO{
		private Connection conn = null;

		public CaixaDAO() {
			try {
				conn = getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Erro ao Abrir a conexão: " + e.getMessage());
			}
		}
		// método responsavel por salvar o aluno no banco de dados
		public void save (Caixa a) throws SQLException {
			PreparedStatement stmt = null;
			try {
				stmt = conn.prepareStatement("insert into usuario values(?, ?, ?, ?, ?)");
				stmt.setDouble(1, a.getId());
				stmt.setInt(2, a.getMatricula());
				stmt.setString(3, a.getNome());
				stmt.setInt(4, a.getSenha());
				stmt.setString(5, a.getCargo());
				
				int flag = stmt.executeUpdate();
				
				if(flag == 0)
					throw new SQLException("Erro ao gravar no banco");
				
			} 
			finally {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			}
		}
		
		public void busca (Caixa a) throws SQLException {
			PreparedStatement stmt = null;
			try {
				stmt = conn.prepareStatement("select from usuario where matricula = ?)");
		
				stmt.setInt(1, a.getMatricula());
				
				
				int flag = stmt.executeUpdate();
				
				if(flag == 0)
					throw new SQLException("Erro ao buscar no banco");
				
			} 
			finally {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			}
		}
		
		public void delete (Caixa a) throws SQLException {
			PreparedStatement stmt = null;
			try {
				stmt = conn.prepareStatement("delete from usuario where matricula = ?");
			
				stmt.setInt(1, a.getMatricula());
				
				int flag = stmt.executeUpdate();
				
				if(flag == 0)
					throw new SQLException("Erro ao deletar no banco");
				
			} 
			finally {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			}
		}
		public void atualizar (Caixa a) throws SQLException {
			PreparedStatement stmt = null;
			try {
				stmt = conn.prepareStatement("update usuario set matricula = ?, nome = ? where senha = ? cargo = ?");
			
				stmt.setInt(1, a.getMatricula());
				stmt.setString(2, a.getNome());
				stmt.setInt(3, a.getSenha());
				stmt.setString(4, a.getCargo());
				
				int flag = stmt.executeUpdate();
				
				if(flag == 0)
					throw new SQLException("Erro ao deletar no banco");
				
			} 
			finally {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
			}
		}
		
}
