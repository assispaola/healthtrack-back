package br.com.fiap.model;

public class EndComp {
    private int idEndComp;
    private int idUsuario;
    private int idCep;
    
	public EndComp(int idEndComp, int idUsuario, int idCep) {
		super();
		this.idEndComp = idEndComp;
		this.idUsuario = idUsuario;
		this.idCep = idCep;
	}
	
	public EndComp() {
		super();
	}
	public int getIdEndComp() {
		return idEndComp;
	}
	public void setIdEndComp(int idEndComp) {
		this.idEndComp = idEndComp;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdCep() {
		return idCep;
	}
	public void setIdCep(int idCep) {
		this.idCep = idCep;
	}
    
    
}
