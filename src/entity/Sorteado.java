package entity;

import java.util.Date;

public class Sorteado {

	private Date dataSorteio;
	
	private Interesse interesse;

	public Date getDataSorteio() {
		return dataSorteio;
	}

	public void setDataSorteio(Date dataSorteio) {
		this.dataSorteio = dataSorteio;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}
	
	public Interesse sortear() {
		//implementar
		return new Interesse();
	}
	
	public boolean jaFoiSorteado(Interesse interesse) {
		//implementar
		return true;
	}
	
}
