package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nomeDoCurso;
	private int codCurso;

	public Curso(String nomeDoCurso, int codCurso) {
		this.nomeDoCurso = nomeDoCurso;
		this.codCurso = codCurso;
	}

	public void adicionarCursos(List<Curso> cursos, Curso curso) {
		if (cursos.contains(curso)) {
			System.out.println("Curso, já existe.");
		} else {
			cursos.add(curso);
		}
	}

	public void listarCursos(List<Curso> cursos) {
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i).getNomeDoCurso());
		}
	}

	public void adicionarDisciplina(List<Disciplina> disciplinas, Disciplina disciplina) {
		if (disciplinas.contains(disciplina)) {
			System.out.println("Disciplina já adicionada.");
		} else {
			disciplinas.add(disciplina);
		}
	}

	public void listarDisciplinas(List<Disciplina> disciplinas) {
		System.out.println("Disciplinas do curso: ");
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i).getNomeDaDisciplina());
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
}