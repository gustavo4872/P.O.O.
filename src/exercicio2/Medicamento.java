package exercicio2;

import javax.swing.JOptionPane;

public class Medicamento {
	String nome;
	String apresentacao;
	Double valor;
	
	void cadastrarMedicamento(){
		nome = JOptionPane.showInputDialog("Nome do Medicamento:");
		apresentacao = JOptionPane.showInputDialog("Apresenção:");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
	}
	
	public String toString() {
		return nome + " " + apresentacao + " " + valor;
	}
}
