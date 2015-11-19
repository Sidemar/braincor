package main.java.br.ufrn.imd.modelo;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Sessao {
	@Id
	private String id;
	private ArrayList<Usuario> colaboradores;
	private int quantidade;
	private Usuario responsavel;
	private Date data;
	private ArrayList<Ideia> ideias;
	private Pauta pauta;
	private Relatorio relatorio;
	
	public Relatorio getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}

	public ArrayList<Ideia> getIdeias() {
		return ideias;
	}

	public void setIdeias(ArrayList<Ideia> ideias) {
		this.ideias = ideias;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Usuario> getColaboradores() {
		return colaboradores;
	}
	
	public void setColaboradores(ArrayList<Usuario> colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Usuario getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
}
