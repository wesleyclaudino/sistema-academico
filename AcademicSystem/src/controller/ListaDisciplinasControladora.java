package controller;

import java.util.ArrayList;
import java.util.List;

import model.Disciplina;

public class ListaDisciplinasControladora extends ArrayList<Disciplina> {
	private static final long serialVersionUID = 1L;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void adicionarDisciplinas(Disciplina disciplina) {
		if (disciplinas.contains(disciplina)) {
			System.out.println("Disciplina já existe.");
		} else {
			disciplinas.add(disciplina);
		}
	}

	public void listarDisciplinas() {
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(recuperarDisciplina(i).getNomeDaDisciplina());
		}
	}

	public Disciplina recuperarDisciplina(int i) {
		return disciplinas.get(i);
	}
}