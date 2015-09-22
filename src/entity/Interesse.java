package entity;

public class Interesse {
	
	private String nomeInteressado;
	
	private String emailInteressado;
	
	private String telefoneInteressado;
	
	private Escola escola;
	
	private Cidade cidade;
	
	private Curso curso;
	
	private Evento evento;
	
	private Serie serie;

	public String getNomeInteressado() {
		return nomeInteressado;
	}

	public void setNomeInteressado(String nomeInteressado) {
		this.nomeInteressado = nomeInteressado;
	}

	public String getEmailInteressado() {
		return emailInteressado;
	}

	public void setEmailInteressado(String emailInteressado) {
		this.emailInteressado = emailInteressado;
	}

	public String getTelefoneInteressado() {
		return telefoneInteressado;
	}

	public void setTelefoneInteressado(String telefoneInteressado) {
		this.telefoneInteressado = telefoneInteressado;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
}
