package model;

import controller.ListaDisciplinasControladora;

/** 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 0015893
 */
public class Curso {
	ListaDisciplinasControladora listaDeDisciplinas = new ListaDisciplinasControladora();
	private String nomeDoCurso;
	private int codCurso;

	public Curso(String nomeDoCurso, int codCurso) {
		this.nomeDoCurso = nomeDoCurso;
		this.codCurso = codCurso;
	}
	public Curso(Curso curso) {
		setNomeDoCurso(curso.getNomeDoCurso());
		setCodCurso(curso.getCodCurso());
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		if (listaDeDisciplinas.contains(disciplina)) {
			System.out.println("Disciplina já adicionada.");
		} else {
			listaDeDisciplinas.add(disciplina);
		}
	}

	public void listarDisciplinas() {
		for (int i = 0; i < listaDeDisciplinas.size(); i++) {
			System.out.println(listaDeDisciplinas.get(i).getNomeDaDisciplina());
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