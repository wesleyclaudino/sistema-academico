package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class ListaAlunosControladora extends ArrayList<Aluno> {
	private static final long serialVersionUID = 1L;
	List<Aluno> alunos = new ArrayList<Aluno>();

	public void adicionarAlunos(Aluno aluno) {
		if (alunos.contains(aluno)) {
			System.out.println("Aluno já existe.");
		} else {
			alunos.add(aluno);
		}
	}

	public void listarAlunos() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i).getNomeDoAluno());
		}
	}
}