package tests;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import model.*;

/**
 * Classe para teste do sistema
 * 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 00
 */

public class RodaSistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean continua = false;
		int opcao;

		// Mudança de nomes das opções do JOptionPaneConfirm
		UIManager.put("OptionPane.yesButtonText", "Sim");
		UIManager.put("OptionPane.noButtonText", "Não");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		UIManager.put("OptionPane.okButtonText", "Enviar");

		// Fluxo de inserção do Aluno
		do {
			// Tela inicial
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um aluno? ", "Aluno",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Instanciando o objeto para uso
				Aluno aluno = new Aluno();

				// Inserção de dados do aluno
				aluno.setNomeDoAluno(JOptionPane.showInputDialog("Digite seu nome: "));
				aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua matrícula: ")));
				aluno.adicionarCursos(JOptionPane.showInputDialog("Insira um novo curso: "));
				aluno.adicionarDisciplina(JOptionPane.showInputDialog("Insira uma nova disciplina: "));
				aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota do primeiro bimestre: ")));
				aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota do segundo bimestre: ")));
				aluno.setNotaSem();

				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);

		// Fluxo de inserção do Curso
		do {
			// Tela inicial
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um curso? ", "Curso",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Instanciando o objeto para uso
				Curso cursos = new Curso();

				// Inserção de dados do curso
				cursos.adicionarCursos(JOptionPane.showInputDialog("Insira um novo curso: "));
				cursos.adicionarDisciplina(JOptionPane.showInputDialog("Insira uma nova disciplina: "));
				System.out.println(cursos.getDisciplinas());
				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);
	}
}