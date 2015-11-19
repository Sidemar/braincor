package main.java.br.ufrn.imd.modelo;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Relatorio {
	@Id
	private String id;
	private ArrayList<Usuario> participantes;
	private ArrayList<Ideia> ideiasRecorrents;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Usuario> getParticipantes() {
		return participantes;
	}
	
	public void setParticipantes(ArrayList<Usuario> participantes) {
		this.participantes = participantes;
	}
	
	public ArrayList<Ideia> getIdeiasRecorrents() {
		return ideiasRecorrents;
	}
	
	public void setIdeiasRecorrents(ArrayList<Ideia> ideiasRecorrents) {
		this.ideiasRecorrents = ideiasRecorrents;
	}
	
}
