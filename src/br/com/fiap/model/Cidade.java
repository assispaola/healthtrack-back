package br.com.fiap.model;

public class Cidade {
	
    private int idCidade;
    private String dsCidade;
    
	public Cidade(int idCidade, String dsCidade) {
		super();
		this.idCidade = idCidade;
		this.dsCidade = dsCidade;
	}
	
	
	public Cidade() {
		super();
	}
	
	
	public int getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	public String getDsCidade() {
		return dsCidade;
	}
	public void setDsCidade(String dsCidade) {
		this.dsCidade = dsCidade;
	}
}
    
   
