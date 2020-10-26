package br.com.fiap.model;

public class Bairro {
    private int idBairro;
    private String dsBairro;
    
	public Bairro(int idBairro, String dsBairro) {
		super();
		this.idBairro = idBairro;
		this.dsBairro = dsBairro;
	}
	
	public Bairro() {
		super();
	}
	public int getIdBairro() {
		return idBairro;
	}
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}
	public String getDsBairro() {
		return dsBairro;
	}
	public void setDsBairro(String dsBairro) {
		this.dsBairro = dsBairro;
	}
    
    
}
