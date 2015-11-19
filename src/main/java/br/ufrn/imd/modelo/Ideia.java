package main.java.br.ufrn.imd.modelo;

import org.springframework.data.annotation.Id;

public class Ideia {
	@Id
	private String id;
	private String corpo;
	private String titulo;
	private Usuario idealizador;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCorpo() {
		return corpo;
	}
	
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Usuario getIdealizador() {
		return idealizador;
	}
	
	public void setIdealizador(Usuario idealizador) {
		this.idealizador = idealizador;
	}
	
}
