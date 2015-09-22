package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Curso;

public class Repository {
	
	private List<Curso> cursos;
	
	public Repository() {
		this.cursos = new ArrayList<Curso>();
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	
}
