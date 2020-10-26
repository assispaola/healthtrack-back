package br.com.fiap.model;

public class Logradouro {

	private int idLogradouro;
	private String dsLogradouro;
	
	public Logradouro(int idLogradouro, String dsLogradouro) {
		super();
		this.idLogradouro = idLogradouro;
		this.dsLogradouro = dsLogradouro;
	}
	
	public Logradouro() {
		super();
	}
	
	public int getIdLogradouro() {
		return idLogradouro;
	}
	public void setIdLogradouro(int idLogradouro) {
		this.idLogradouro = idLogradouro;
	}
	public String getDsLogradouro() {
		return dsLogradouro;
	}
	public void setDsLogradouro(String dsLogradouro) {
		this.dsLogradouro = dsLogradouro;
	}
	
	
}
