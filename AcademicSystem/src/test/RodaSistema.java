package test;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import controller.ListaAlunosControladora;
import controller.ListaCursosControladora;
import controller.ListaDisciplinasControladora;
import model.*;

/**
 * Classe para teste do sistema
 * 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 0015893
 */
public class RodaSistema {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean continua = false;
		int opcao;
		int opcaoReuso;

		// Mudança de nomes das opções do JOptionPaneConfirm
		UIManager.put("OptionPane.yesButtonText", "Sim");
		UIManager.put("OptionPane.noButtonText", "Não");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		UIManager.put("OptionPane.okButtonText", "Enviar");

		// Criação da lista de disciplinas
		ListaDisciplinasControladora listaDeDisciplinas = new ListaDisciplinasControladora();

		// Fluxo de inserção das disciplinas
		do {
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma disciplina? ", "Disciplina",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Inserção de dados da disciplina
				Disciplina disciplina = new Disciplina(JOptionPane.showInputDialog("Insira uma nova disciplina: "),
						Integer.parseInt(JOptionPane.showInputDialog("Insira o código da disciplina: ")));
				listaDeDisciplinas.adicionarDisciplinas(disciplina);
				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);

		// Criação da lista de cursos
		ListaCursosControladora listaDeCursos = new ListaCursosControladora();

		// Fluxo de inserção dos cursos e suas disciplinas
		do {
			// Tela confirmação de adição de curso
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um curso? ", "Curso",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Inserção de dados do curso
				Curso curso = new Curso(JOptionPane.showInputDialog("Insira um novo curso: "),
						Integer.parseInt(JOptionPane.showInputDialog("Insira o código do curso: ")));

				listaDeCursos.adicionarCursos(curso);

				// Inserção de dados das disciplinas do curso
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma disciplina ao curso?",
							"Disciplina do Curso", JOptionPane.YES_NO_CANCEL_OPTION);

					if (opcaoReuso == JOptionPane.OK_OPTION) {
						int pos = JOptionPane.showOptionDialog(null, "Adicione uma disciplina", "Disciplinas",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
								listaDeDisciplinas.nomesNoVetor(), listaDeDisciplinas.nomesNoVetor()[0]);

						Disciplina disciplina = new Disciplina(listaDeDisciplinas.disciplinasNoVetor()[pos]);
						curso.adicionarDisciplina(disciplina);
					}
				} while (opcaoReuso == JOptionPane.OK_OPTION);
				continua = true;
			} else if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CANCEL_OPTION) {
				continua = false;
			}
		} while (continua == true && opcao != JOptionPane.CANCEL_OPTION || opcao != JOptionPane.NO_OPTION);

		// Criação da lista de alunos
		ListaAlunosControladora listaDeAlunos = new ListaAlunosControladora();

		// Fluxo de inserção do aluno, seus cursos e suas disciplinas
		do {
			// Tela inicial
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar um aluno? ", "Aluno",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (opcao == JOptionPane.OK_OPTION) {
				// Inserção de dados obrigatórios do aluno
				Aluno aluno = new Aluno(JOptionPane.showInputDialog("Digite seu nome: "),
						Integer.parseInt(JOptionPane.showInputDialog("Digite sua matrícula: ")));

				// Inserção de dados adicionais do aluno
				opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja adicionar as nota do aluno?", "Notas do aluno",
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (opcaoReuso == JOptionPane.OK_OPTION) {
					aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota do primeiro bimestre: ")));
					aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota do segundo bimestre: ")));
					aluno.setNotaSem();
				}

				// Inserção dos cursos do aluno
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja adicionar um curso ao aluno?",
							"Cursos do Aluno", JOptionPane.YES_NO_CANCEL_OPTION);

					if (opcaoReuso == JOptionPane.OK_OPTION) {
						int pos = JOptionPane.showOptionDialog(null, "Adicione um curso", "Cursos",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
								listaDeCursos.nomesNoVetor(), listaDeCursos.nomesNoVetor()[0]);

						Curso curso = new Curso(listaDeCursos.cursosNoVetor()[pos]);
						aluno.adicionarCurso(curso);
					}
				} while (opcaoReuso == JOptionPane.OK_OPTION);

				// Inserção das disciplinas do aluno
				do {
					opcaoReuso = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma disciplina ao aluno?",
							"Disciplinas do Aluno", JOptionPane.YES_NO_CANCEL_OPTION);

					if (opcaoReuso == JOptionPane.OK_OPTION) {
						int pos = JOptionPane.showOptionDialog(null, "Adicione uma disciplina", "Disciplinas",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
								listaDeDisciplinas.nomesNoVetor(), listaDeDisciplinas.nomesNoVetor()[0]);

						Disciplina disciplina = new Disciplina(listaDeDisciplinas.disciplinasNoVetor()[pos]);
						aluno.adicionarDisciplina(disciplina);
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