package encapsulamento;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private int idade;
	private Cidade cidade = new Cidade();
	private String email;
	
	public void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		setEmail(JOptionPane.showInputDialog("Email:"));
		cidade.cadastra();
	}
	
	public String toString() {
		return getNome() +"-"+getIdade()+"-"+getCidade()+"\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		}else {
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade Incorreta")));
		}
		
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setEmail(String email){
		if (email.indexOf('@')==1) {
			setEmail(JOptionPane.showInputDialog("Email sem @"));
		}else {
			if (email.indexOf('.')<1) {
				setEmail(JOptionPane.showInputDialog("Email sem ."));
			}else {
				if (email.length()>4) {
					this.email = email;
				}else {
					setEmail(JOptionPane.showInputDialog("Email sem 5 caracteres"));
				}
			}
		}
		
	}
	
	
}
