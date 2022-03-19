package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	List<String> disciplinas = new ArrayList<String>();
	List<String> cursos = new ArrayList<String>();
	private String nomeDoCurso;
	private int codCurso;
	
	public void adicionarCursos(String curso) {
		cursos.add(curso);
	}

	public void adicionarDisciplina(String disciplina) {
		disciplinas.add(disciplina);
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
	
	public List<String> getDisciplinas(){
		return disciplinas;
	}
	
	public List<String> getCursos(){
		return cursos;
	}
}