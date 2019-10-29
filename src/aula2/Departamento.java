package aula2;

import javax.swing.JOptionPane;

public class Departamento {
	String nome;
	Pessoa gerente = new Pessoa();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog(null, "Nome do Departamento:");
		gerente.cadastra();
	}
	
	
	public String toString() {
		return nome + " " + gerente + "\n";
	}
}
