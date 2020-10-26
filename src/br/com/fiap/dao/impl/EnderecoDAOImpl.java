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
import br.com.fiap.model.Pag;

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

	
	public void cadastrar(Endereco endereco) {
		PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_ENDERECO (ID_ENDERECO, DS_ENDERECO, NR_ENDRECO) VALUES(seq_endereco.nextval, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, endereco.getDsEndereco());
			stmt.setInt(2, endereco.getNrEndereco());
			stmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
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
