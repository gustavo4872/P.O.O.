package joao;

import javax.swing.JOptionPane;

public class MainAcademia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.cadastra();
		JOptionPane.showMessageDialog(null, aluno.nome);
		for (Exercicio exercicio : aluno.exercicios) {
			JOptionPane.showMessageDialog(null, exercicio);
		}
	}

}
