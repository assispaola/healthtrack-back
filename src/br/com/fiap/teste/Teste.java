package br.com.fiap.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.model.Usuario;

public class Teste {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		List<Usuario> lista = dao.listarTodos();

		// INSERT USUÁRIO 1
		Usuario user = new Usuario();
		user.setDsEmail("assispaola.dev@gmail.com");
		user.setDsSenha("111193");

		String data = "11/11/1993";
		Date dataf = parser.parse(data);
		java.sql.Date dataSql = new java.sql.Date(dataf.getTime());
		user.setDtNascimento(dataSql);

		String data2 = "01/02/2020";
		Date dataf2 = parser.parse(data2);
		java.sql.Date dataSql2 = new java.sql.Date(dataf2.getTime());
		user.setDtCadastro(dataSql2);
		dao.cadastrar(user);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT USUÁRIO 2
		Usuario user2 = new Usuario();
		user.setDsEmail("guilherme.vilhena02@gmail.com");
		user.setDsSenha("220402");

		String data3 = "22/04/2002";
		Date dataf3 = parser.parse(data3);
		java.sql.Date dataSql3 = new java.sql.Date(dataf3.getTime());
		user.setDtNascimento(dataSql);

		String data4 = "02/02/2020";
		Date dataf4 = parser.parse(data4);
		java.sql.Date dataSql4 = new java.sql.Date(dataf4.getTime());
		user.setDtCadastro(dataSql4);
		dao.cadastrar(user);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT USUÁRIO 3
		Usuario user3 = new Usuario();
		user.setDsEmail("riqueluca@live.com");
		user.setDsSenha("080494");

		String data5 = "08/04/1994";
		Date dataf5 = parser.parse(data5);
		java.sql.Date dataSql5 = new java.sql.Date(dataf5.getTime());
		user.setDtNascimento(dataSql);

		String data6 = "03/02/2020";
		Date dataf6 = parser.parse(data6);
		java.sql.Date dataSql6 = new java.sql.Date(dataf6.getTime());
		user.setDtCadastro(dataSql6);
		dao.cadastrar(user);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT USUÁRIO 4
		Usuario user4 = new Usuario();
		user.setDsEmail("ihenriqueferr@gmail.com");
		user.setDsSenha("140795");

		String data7 = "14/07/1995";
		Date dataf7 = parser.parse(data7);
		java.sql.Date dataSql7 = new java.sql.Date(dataf7.getTime());
		user.setDtNascimento(dataSql);

		String data8 = "04/02/2020";
		Date dataf8 = parser.parse(data8);
		java.sql.Date dataSql8 = new java.sql.Date(dataf8.getTime());
		user.setDtCadastro(dataSql8);
		dao.cadastrar(user);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT USUÁRIO 5
		Usuario user5 = new Usuario();
		user.setDsEmail("gustavopetry@outlook.com");
		user.setDsSenha("030895");

		String data9 = "03/08/1995";
		Date dataf9 = parser.parse(data9);
		java.sql.Date dataSql9 = new java.sql.Date(dataf9.getTime());
		user.setDtNascimento(dataSql);

		String data10 = "05/02/2020";
		Date dataf10 = parser.parse(data10);
		java.sql.Date dataSql10 = new java.sql.Date(dataf10.getTime());
		user.setDtCadastro(dataSql10);
		dao.cadastrar(user);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		for (Usuario usuario : lista) {

			System.out.println(usuario.getIdUsuario() + " E-mail:" + usuario.getDsEmail() + " Senha: "
					+ usuario.getDsSenha() + " Dt nasc: " + parser.format(usuario.getDtNascimento()) + " Dt cadastro: "
					+ parser.format(usuario.getDtCadastro()));
		}

	}

}
