package model;

public class Disciplina {
	private String nomeDaDisciplina;
	private int codDisciplina;
	
	public Disciplina(String nomeDaDisciplina, int codDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.codDisciplina = codDisciplina;
	}

	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
}