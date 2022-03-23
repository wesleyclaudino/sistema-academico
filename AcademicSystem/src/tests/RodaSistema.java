package tests;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import controller.ListaAlunosControladora;
import controller.ListaCursosControladora;
import model.*;

/**
 * Classe para teste do sistema
 * 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus Andr� Pereira G�es - 00
 */
public class RodaSistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean continua = false;
		int opcao;
		int opcaoReuso;

		// Mudan�a de nomes das op��es do JOptionPaneConfirm
		UIManager.put("OptionPane.yesButtonText", "Sim");
		UIManager.put("OptionPane.noButtonText", "N�o");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		UIManager.put("OptionPane.okButtonText", "Enviar");

		// Cria��o da lista de cursos
		ListaCursosControladora listaDeCursos = new ListaCursosControladora();

		// Fluxo de inser��o dos cursos e suas disciplinas
		do {
			// Tela confirma��o de adi��o de curso
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um curso? ", "Curso",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Inser��o de dados do curso
				Curso curso = new Curso(JOptionPane.showInputDialog("Insira um novo curso: "),
						Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo do curso: ")));

				listaDeCursos.adicionarCursos(curso);

				// Inser��o de dados das disciplinas do curso
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma disciplina ao curso?",
							"Disciplina do Curso", JOptionPane.YES_NO_CANCEL_OPTION);

					if (opcaoReuso == JOptionPane.OK_OPTION) {
						Disciplina disciplina = new Disciplina(
								JOptionPane.showInputDialog("Insira uma nova disciplina: "),
								Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo da disciplina: ")));

						curso.adicionarDisciplina(disciplina);
					}
				} while (opcaoReuso == JOptionPane.OK_OPTION);
				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);

		// Cria��o da lista de alunos
		ListaAlunosControladora listaDeAlunos = new ListaAlunosControladora();

		// Fluxo de inser��o do Aluno
		do {
			// Tela inicial
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um aluno? ", "Aluno",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Inser��o de dados obrigat�rios do aluno
				Aluno aluno = new Aluno(JOptionPane.showInputDialog("Digite seu nome: "),
						Integer.parseInt(JOptionPane.showInputDialog("Digite sua matr�cula: ")));
				
				// Inser��o de dados adicionais do aluno
				aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota do primeiro bimestre: ")));
				aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota do segundo bimestre: ")));
				aluno.setNotaSem();

				// Inser��o de dados de curso do aluno
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja um curso ao aluno? ", "Curso do Aluno",
							JOptionPane.YES_NO_CANCEL_OPTION);
					
					if (opcaoReuso == JOptionPane.OK_OPTION) {
						aluno.adicionarCursos(JOptionPane.showInputDialog("Insira um novo curso: "));
					}
				} while (opcaoReuso == JOptionPane.OK_OPTION);
				
				// Inser��o de dados de disciplinas do aluno
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja uma disciplina ao aluno? ", "Disciplina do Aluno",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (opcaoReuso == JOptionPane.OK_OPTION) {
						aluno.adicionarDisciplina(JOptionPane.showInputDialog("Insira uma nova disciplina: "));
					}
				} while (opcaoReuso == JOptionPane.OK_OPTION);		

				// Adicionando o aluno na lista
				listaDeAlunos.adicionarAlunos(aluno);
				
				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);
	}
}