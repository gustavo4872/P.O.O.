package pessoaTabela;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String idade;
	private String cpf;
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome");
		idade = JOptionPane.showInputDialog("Idade");
		cpf = JOptionPane.showInputDialog("CPF");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
