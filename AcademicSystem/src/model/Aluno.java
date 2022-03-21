package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	List<String> disciplinas = new ArrayList<String>();
	List<String> cursos = new ArrayList<String>();
	private String nomeDoAluno;
	private int matricula;
	private double nota1;
	private double nota2;
	private double notaSem;
	
	public void adicionarCursos(String curso) {
		if (cursos.contains(curso)) {
			System.out.println("Curso, já adicionado.");
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

	public String getNomeDoAluno() {
		return nomeDoAluno;
	}

	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaSem() {
		return notaSem;
	}

	public void setNotaSem() {
		this.notaSem = (this.nota1 + this.nota2) / 2;
	}
	
	public List<String> getCursos(){
		return cursos;
	}
	public List<String> getDisciplinas(){
		return disciplinas;
	}
}