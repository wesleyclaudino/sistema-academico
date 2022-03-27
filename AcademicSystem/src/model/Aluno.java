package model;

import controller.ListaCursosControladora;
import controller.ListaDisciplinasControladora;

/** 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 0015893
 */
public class Aluno {
	ListaDisciplinasControladora listaDeDisciplinas = new ListaDisciplinasControladora();
	ListaCursosControladora listaDeCursos = new ListaCursosControladora();
	private String nomeDoAluno;
	private int matricula;
	private double nota1;
	private double nota2;
	private double notaSem;
	
	public Aluno(String nomeDoAluno, int matricula) {
		this.nomeDoAluno = nomeDoAluno;
		this.matricula = matricula;
	}
	
	public void adicionarCurso(Curso curso) {
		if (listaDeCursos.contains(curso)) {
			System.out.println("Curso já adicionado.");
		} else {
			listaDeCursos.add(curso);
		}
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		if (listaDeDisciplinas.contains(disciplina)) {
			System.out.println("Disciplina já adicionada.");
		} else {
			listaDeDisciplinas.add(disciplina);
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
}