package entity;

public class Cidade {
	
	private String nomeCidade;

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	@Override
	public String toString() {
		return  nomeCidade;
	}

}
