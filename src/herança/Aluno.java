package herança;

import java.util.Random;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
	
	public String toString() {
		return super.toString()
			   + "Número da Matrícula:"+getNumeroMatricula()+"\n"
			   + "Nome do Curso:"+getNomeCurso()+"\n";
	}
	
	private int numeroMatricula;
	private String nomeCurso;
	
	public void cadastra() {
		Random a = new Random();
		setNumeroMatricula(a.nextInt());
		setNomeCurso(JOptionPane.showInputDialog("Nome do Curso"));
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}
