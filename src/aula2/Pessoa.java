package aula2;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	String sexo;
	int idade;
	Carro carro = new Carro();
	Endereco endereco = new Endereco();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog(null,"Nome(Pessoa):");
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade(Pessoa):"));
		sexo =  JOptionPane.showInputDialog(null,"Sexo(Pessoa):");
		carro.cadastra();
		endereco.cadastra();
	}
	
	public String toString(){
		return nome + " "+ endereco + " " + carro + "\n";
	}
	
}
