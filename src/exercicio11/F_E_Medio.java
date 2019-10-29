package exercicio11;

import javax.swing.JOptionPane;

public class F_E_Medio extends Funcionario {
	
	private String nomeEscola;
	private int anoConclusao;
	
	@Override
	void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Funcionário"));
		setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda:")));
		
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getAnoConclusao() {
		return anoConclusao;
	}

	public void setAnoConclusao(int anoConclusao) {
		this.anoConclusao = anoConclusao;
	}
	
	

}
