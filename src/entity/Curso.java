package entity;

public class Curso {
	
	private String nomeCurso;
	
	public Curso(){}
	
	public Curso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	@Override
	public String toString() {
		return nomeCurso;
	}
	
	
}
