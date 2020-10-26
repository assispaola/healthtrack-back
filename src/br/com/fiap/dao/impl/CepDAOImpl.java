package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.CepDAO;
import br.com.fiap.model.Cep;

public class CepDAOImpl implements CepDAO{
	private Connection conexao;
	
	@Override
	public List<Cep> listarTodos() {
		List<Cep> lista = new ArrayList<Cep>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_CEP";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				Integer idCep = rs.getInt("ID_CEP");
				Integer nrCep = rs.getInt("NR_CEP");
				Integer idLogradouro = rs.getInt("T_HTL_LOGRADOURO_ID_LOGRADOURO");
				Integer idEndereco = rs.getInt("T_HTL_ENDERECO_ID_ENDERECO");
				Integer idUf = rs.getInt("T_HTL_UF_ID_UF");
				Integer idCidade = rs.getInt("H_HTL_CIDADE_ID_CIDADE");
				Integer idCompl = rs.getInt("T_HTL_COMPLEMENTO_ID_COMPL");
				Integer idBairro = rs.getInt("T_HTL_BAIRRO_ID_BAIRRO");
				
				
				Cep cep = new Cep(idCep, nrCep, idLogradouro, idEndereco, idUf, idCidade, idCompl, idBairro);
				lista.add(cep);
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
	public void cadastrar(Cep cep) {
		PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_CEP(ID_CEP, NR_CEP, T_HTL_LOGRADOURO_ID_LOGRADOURO, T_HTL_ENDERECO_ID_ENDERECO, T_HTL_UF_ID_UF, H_HTL_CIDADE_ID_CIDADE, T_HTL_COMPLEMENTO_ID_COMPL, T_HTL_BAIRRO_ID_BAIRRO) VALUES(seq_cep.nextval, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, cep.getNrCep());
			stmt.setInt(2, cep.getIdLogradouro());
			stmt.setInt(3, cep.getIdEndereco());
			stmt.setInt(4, cep.getIdUf());
			stmt.setInt(5, cep.getIdCidade());
			stmt.setInt(6, cep.getIdCompl());
			stmt.setInt(7, cep.getIdBairro());
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
	public void atualizar(Cep cep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idCep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cep buscarPorId(int idCep) {
		// TODO Auto-generated method stub
		return null;
	}
}
