package model;

/** 
 * @author Wesley Claudino Rodrigues - 0014950
 * @author Matheus André Pereira Góes - 0015893
 */
public class Disciplina {
	private String nomeDaDisciplina;
	private int codDisciplina;
	
	public Disciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}
	public Disciplina(String nomeDaDisciplina, int codDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.codDisciplina = codDisciplina;
	}
	public Disciplina(Disciplina disciplina) {
		setNomeDaDisciplina(disciplina.getNomeDaDisciplina());
		setCodDisciplina(disciplina.getCodDisciplina());
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