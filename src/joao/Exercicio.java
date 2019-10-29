package joao;

import javax.swing.JOptionPane;

public class Exercicio {
	
	 String nome;
	 int quantidadeRepeticao;
	 double carga;
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("Nome:");
		quantidadeRepeticao = Integer.parseInt(JOptionPane.showInputDialog("Nome:"));
		carga = Double.parseDouble(JOptionPane.showInputDialog("Carga:"));
	}
	
}
