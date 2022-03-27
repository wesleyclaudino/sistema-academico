package controller;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

/** 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 0015893
 */
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

	public String[] nomesNoVetor() {
		String[] vetor = new String[cursos.size()];
		for (int i = 0; i < cursos.size(); i++) {
			vetor[i] = cursosNoVetor()[i].getNomeDoCurso();
		}
		return vetor;
	}

	public Curso[] cursosNoVetor() {
		Curso[] opcoes = new Curso[cursos.size()];
		for (int i = 0; i < cursos.size(); i++) {
			opcoes[i] = recuperarCurso(i);
		}
		return opcoes;
	}

	public Curso recuperarCurso(int i) {
		return cursos.get(i);
	}
	
	public void listarCursos() {
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i).getNomeDoCurso());
		}
	}
}