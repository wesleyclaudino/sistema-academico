package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	List<String> disciplinas = new ArrayList<String>();
	List<String> cursos = new ArrayList<String>();
	private String nomeDoCurso;
	private int codCurso;

	public void adicionarCursos(String curso) {
		if (cursos.contains(curso)) {
			System.out.println("Curso, já existe.");
		} else {
			cursos.add(curso);
		}
	}

	public void adicionarDisciplina(String disciplina) {
		if(disciplinas.contains(disciplina)) {
			System.out.println("Disciplina já adicionada.");
		}else {
			disciplinas.add(disciplina);
		}
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public List<String> getCursos() {
		return cursos;
	}
}