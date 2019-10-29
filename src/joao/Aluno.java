package joao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	 String nome;
	 String sexo;
	 int idade;
	 ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("Nome:");
		sexo = JOptionPane.showInputDialog("Sexo:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		int resposta;
		do {
			resposta = JOptionPane.showConfirmDialog(null, "Deseja Adicionar um Exercício?", "eaemen", JOptionPane.YES_NO_OPTION);
			if (resposta == JOptionPane.YES_OPTION) {
				Exercicio ex = new Exercicio();
				ex.cadastra();
				exercicios.add(ex);
			}
		} while (resposta == JOptionPane.YES_OPTION);
	}
}
