package exercicio11;

import javax.swing.JOptionPane;

public class F_E_Basico extends Funcionario {

	private String nomeEscola;
	
	@Override
	void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Funcionário:"));
		setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda:")));
		setNomeEscola(JOptionPane.showInputDialog("Nome da Escola:"));
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
}
