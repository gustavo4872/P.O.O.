package herança;

import java.util.Random;

import javax.swing.JOptionPane;

public class Pessoa extends Object{
	 
	Pessoa(){
		setNome("João");
		setSexo('M');
	}
	
	public String toString() {
		return "Nome:"+getNome()+"\n"
			 + "Sexo:"+getSexo()+"\n";
	}
	
	protected String nome;
	protected char sexo;
	protected double rand = Math.random();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome da Pessoa:"));
		setSexo(JOptionPane.showInputDialog("Sexo:").charAt(0));
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
	
}
