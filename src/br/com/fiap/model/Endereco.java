package br.com.fiap.model;

public class Endereco {

	private int idEndereco;
	private String dsEndereco;
	private int nrEndereco;
	
	public Endereco(int idEndereco, String dsEndereco, int nrEndereco) {
		super();
		this.idEndereco = idEndereco;
		this.dsEndereco = dsEndereco;
		this.nrEndereco = nrEndereco;
	}
	
	

	public Endereco() {
		super();
	}



	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getDsEndereco() {
		return dsEndereco;
	}

	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}

	public int getNrEndereco() {
		return nrEndereco;
	}

	public void setNrEndereco(int nrEndereco) {
		this.nrEndereco = nrEndereco;
	}
	
	

}
