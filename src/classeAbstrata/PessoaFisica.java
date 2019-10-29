package classeAbstrata;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
	
	public PessoaFisica() {
		setNome(JOptionPane.showInputDialog("Nome:"));
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\n"
				+ "CPF: "+getCpf();
	}
	
	private int cpf;

	public void cadastra() {
		setCpf(Integer.parseInt(JOptionPane.showInputDialog("Número do CPF:")));
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
