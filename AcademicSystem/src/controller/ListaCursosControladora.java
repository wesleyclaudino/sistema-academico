package controller;

import java.util.ArrayList;
import java.util.List;
import model.Curso;

public class ListaCursosControladora extends ArrayList<Curso> {
	private static final long serialVersionUID = 1L;
	List<Curso> cursos = new ArrayList<Curso>();

	public void adicionarCursos(Curso curso) {
		if (cursos.contains(curso)) {
			System.out.println("Curso já existe.");
		} else {
			cursos.add(curso);
		}
	}

	public String listarCursos() {
		for (int i = 0; i < cursos.size(); i++) {
			return cursos.get(i).getNomeDoCurso();
		}
		return "";
	}
}