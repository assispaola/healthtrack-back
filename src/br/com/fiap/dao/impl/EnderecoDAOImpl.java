package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.model.Endereco;

public class EnderecoDAOImpl implements EnderecoDAO {

	private Connection conexao;
	
	@Override
	public List<Endereco> listarTodos() {
		List<Endereco> lista = new ArrayList<Endereco>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_Endereco";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idEndereco = rs.getInt("ID_Endereco");
				String dsEndereco = rs.getString("DS_ENDERECO");
				int nrEndereco = rs.getInt("NR_ENDRECO");

				
				Endereco endereco = new Endereco(idEndereco, dsEndereco, nrEndereco);
				lista.add(endereco);
			}
						
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			}catch(SQLException e) {
				e.printStackTrace(); 
			}
		}
		return lista;
	}

	@Override
	public void cadastrar(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idEndereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco buscarPorId(int idEndereco) {
		// TODO Auto-generated method stub
		return null;
	}
}
