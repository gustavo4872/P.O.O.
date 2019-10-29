package bancoHerança;

import javax.swing.JOptionPane;

public class Cliente {
	
	public Cliente(){
	
	}
	
	public String toString() {
			return "Cliente: "+getNome()+"\n"
				 + "Sexo: "+getSexo()+"\n"
				 + "Idade: "+getIdade();
	}
	
	private String nome;
	private char sexo;
	private int idade;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Cliente: "));
		setSexo(JOptionPane.showInputDialog("Sexo: ").charAt(0));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("")) {
			setNome(JOptionPane.showInputDialog("Nome Inválido:"));
		}else {
			this.nome = nome;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
