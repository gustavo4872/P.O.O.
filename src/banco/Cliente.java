package banco;

import javax.swing.JOptionPane;

public class Cliente {

	public Cliente(){
		setIdade(18);
	}
	
	public String toString() {
		return "Nome: "+getNome()+"\n"
			 + "Sexo: "+getSexo()+"\n"
			 + "Idade: "+getIdade()+"\n\n";
	}
	
	private String nome;
	private char sexo;
	private int idade;
	
	public void cadastraCliente() {
		setNome(JOptionPane.showInputDialog("Nome do Cliente:"));
		setSexo(JOptionPane.showInputDialog("Sexo: ").charAt(0));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
