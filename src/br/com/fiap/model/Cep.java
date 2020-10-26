package br.com.fiap.model;

public class Cep {
	
	private int idCep;
	private int nrCep;
	private int idLogradouro;
	private int idEndereco;
	private int idUf;
	private int idCidade;
	private int idCompl;
	private int idBairro;
	
	public Cep(int idCep, int nrCep, int idLogradouro, int idEndereco, int idUf, int idCidade, int idCompl,
			int idBairro) {
		super();
		this.idCep = idCep;
		this.nrCep = nrCep;
		this.idLogradouro = idLogradouro;
		this.idEndereco = idEndereco;
		this.idUf = idUf;
		this.idCidade = idCidade;
		this.idCompl = idCompl;
		this.idBairro = idBairro;
	}

	public Cep() {
		super();
	}

	public int getIdCep() {
		return idCep;
	}

	public void setIdCep(int idCep) {
		this.idCep = idCep;
	}

	public int getNrCep() {
		return nrCep;
	}

	public void setNrCep(int nrCep) {
		this.nrCep = nrCep;
	}

	public int getIdLogradouro() {
		return idLogradouro;
	}

	public void setIdLogradouro(int idLogradouro) {
		this.idLogradouro = idLogradouro;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public int getIdUf() {
		return idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public int getIdCompl() {
		return idCompl;
	}

	public void setIdCompl(int idCompl) {
		this.idCompl = idCompl;
	}

	public int getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}
	
	

}
