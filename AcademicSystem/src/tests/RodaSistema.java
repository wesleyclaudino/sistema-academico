package tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import model.*;

/**
 * Classe para teste do sistema
 */

public class RodaSistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//Mudan�a de nomes das op��es do JOptionPaneConfirm
		UIManager.put("OptionPane.yesButtonText", "Sim");
		UIManager.put("OptionPane.noButtonText", "N�o");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");

		// Instancia��o dos objetos para teste.
		Aluno aluno = new Aluno();
		Curso cursos = new Curso();
		
//		ArrayList<Curso> cursos = new ArrayList<>();
		
		// Telas
		String telaNome = JOptionPane.showInputDialog("Digite seu nome: ");
		String telaMatricula = JOptionPane.showInputDialog("Digite sua matr�cula: ");
		String telaBim1 = JOptionPane.showInputDialog("Nota do primeiro bimestre: ");
		String telaBim2 = JOptionPane.showInputDialog("Nota do segundo bimestre: ");
		int telaNovoCurso = JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo curso?");
		String telaNomeCurso = JOptionPane.showInputDialog("Insira um novo curso: ");
		String telaNomeDisciplina = JOptionPane.showInputDialog("Insira uma nova disciplina: ");

		// Inser��o de dados do aluno utilizando o swing.
		aluno.setNomeDoAluno(telaNome);
		aluno.setMatricula(Integer.parseInt(telaMatricula));
		aluno.adicionarCursos(telaNomeCurso);
		aluno.adicionarDisciplina(telaNomeDisciplina);
		aluno.setNota1(Double.parseDouble(telaBim1));
		aluno.setNota2(Double.parseDouble(telaBim2));
		aluno.setNotaSem();

		// Adi��o de novos cursos
		System.out.println(telaNovoCurso);
		if(telaNovoCurso == JOptionPane.OK_OPTION) {
			cursos.adicionarCursos(telaNomeCurso);
			cursos.adicionarDisciplina(telaNomeDisciplina);
		}
		
//		System.out.println(cursos.getNomeDoCurso());

		// Apresenta��o de dados no console
			// Controle de notas dos alunos
		System.out.println("Aluno: " + aluno.getNomeDoAluno() +
							"\nMatr�cula: " + aluno.getMatricula() +
							"\nCursos matriculados: " + aluno.getCursos() +
							"\nDisciplinas cursadas: " + aluno.getDisciplinas() +
							"\nNota 1� Bimestre: " + aluno.getNota1() +
							"\nNota 2� Bimestre: " + aluno.getNota2() +
							"\nNota Semestral: " + aluno.getNotaSem());
		System.out.println("Cursos: " + cursos.getCursos());
		System.out.println("Disciplinas do curso: " + cursos.getDisciplinas());
	}
}