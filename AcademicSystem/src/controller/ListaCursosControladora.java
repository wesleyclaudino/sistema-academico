package controller;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class ListaCursosControladora extends ArrayList<Curso> {
	private static final long serialVersionUID = 1757225109110010500L;
	
	List<Curso> cursos = new ArrayList<Curso>();
	
	public void adicionarCursos(Curso curso) {
		if (this.cursos.contains(curso)) {
			System.out.println("Curso, já existe.");
		} else {
			this.cursos.add(curso);
		}
	}

	public void listarCursos() {
		for (int i = 0; i < this.cursos.size(); i++) {
			System.out.println(this.cursos.get(i).getNomeDoCurso());
		}
	}
}