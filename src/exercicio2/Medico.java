package exercicio2;

import javax.swing.JOptionPane;

public class Medico {
	String nome;
	String especialidade;
	
	void cadastrarMedico(){
		nome = JOptionPane.showInputDialog("Nome do Médico:");
		especialidade = JOptionPane.showInputDialog("Especialidade:");
	}
	
	public String toString() {
		return nome + " " + especialidade +"\n";
	}
}
