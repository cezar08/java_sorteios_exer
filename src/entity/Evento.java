package entity;

import java.util.List;

public class Evento {
	
	private String nomeEvento;
	
	private int ano;
	
	private int periodo;
	
	private List<Interesse> interesses;

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public List<Interesse> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<Interesse> interesses) {
		this.interesses = interesses;
	}
	
	@Override
	public String toString() {
		return  nomeEvento;
	}
 	
}
