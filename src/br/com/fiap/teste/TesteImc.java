package br.com.fiap.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.fiap.dao.impl.ImcDAOImpl;
import br.com.fiap.model.Imc;

public class TesteImc {

	public static void main(String[] args) throws ParseException {
		ImcDAOImpl dao = new ImcDAOImpl();
		List<Imc> lista = dao.listarTodos();
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/YYYY");

		// INSERT IMC 1
		Imc imc1 = new Imc();
		imc1.setValor(35.0);
		imc1.setDtCadastro(Calendar.getInstance());

		imc1.setPeso(72.5);
		imc1.setAltura(1.62);
		imc1.setIdUsuario(8002);
		dao.cadastrar(imc1);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT IMC 2
		Imc imc2 = new Imc();
		imc2.setValor(15.0);
		imc2.setDtCadastro(Calendar.getInstance());

		imc2.setPeso(90.0);
		imc2.setAltura(1.42);
		imc2.setIdUsuario(8003);
		dao.cadastrar(imc2);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT IMC 3
		Imc imc3 = new Imc();
		imc3.setValor(40.0);
		imc3.setDtCadastro(Calendar.getInstance());

		imc3.setPeso(105.0);
		imc3.setAltura(1.80);
		imc3.setIdUsuario(8003);
		dao.cadastrar(imc3);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT IMC 4
		Imc imc4 = new Imc();
		imc4.setValor(26.2);
		imc4.setDtCadastro(Calendar.getInstance());

		imc4.setPeso(85.0);
		imc4.setAltura(1.65);
		imc4.setIdUsuario(8004);
		dao.cadastrar(imc4);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT IMC 5
		Imc imc5 = new Imc();
		imc5.setValor(28.5);
		imc5.setDtCadastro(Calendar.getInstance());

		imc5.setPeso(58.2);
		imc5.setAltura(1.68);
		imc5.setIdUsuario(8005);
		dao.cadastrar(imc5);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		for (Imc imc : lista) {

			System.out.println(" ID IMC:" + imc.getIdImc() + " VALOR:" + imc.getValor() + " DT CADASTRO:"
					+ parser.format(imc.getDtCadastro().getTime()) + " PESO:" + imc.getPeso() + " ALTURA:"
					+ imc.getAltura() + " ID USUARIO: " + imc.getIdUsuario());

		}
	}

}
