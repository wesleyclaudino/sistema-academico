package controller;

import java.util.ArrayList;
import java.util.List;

import model.Disciplina;

/** 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus Andr? Pereira G?es - 0015893
 */
public class ListaDisciplinasControladora extends ArrayList<Disciplina> {
	private static final long serialVersionUID = 1L;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void adicionarDisciplinas(Disciplina disciplina) {
		if (disciplinas.contains(disciplina)) {
			System.out.println("Disciplina j? existe.");
		} else {
			disciplinas.add(disciplina);
		}
	}
	
	public String[] nomesNoVetor() {
		String[] vetor = new String[disciplinas.size()];
		for (int i = 0; i < disciplinas.size(); i++) {
			vetor[i] = disciplinasNoVetor()[i].getNomeDaDisciplina();
		}
		return vetor;
	}

	public Disciplina[] disciplinasNoVetor() {
		Disciplina[] opcoes = new Disciplina[disciplinas.size()];
		for (int i = 0; i < disciplinas.size(); i++) {
			opcoes[i] = recuperarDisciplina(i);
		}
		return opcoes;
	}

	public Disciplina recuperarDisciplina(int i) {
		return disciplinas.get(i);
	}
	
	public void listarDisciplinas() {
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i).getNomeDaDisciplina());
		}
	}
}