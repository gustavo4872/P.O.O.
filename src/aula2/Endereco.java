package aula2;

import javax.swing.JOptionPane;

public class Endereco {
	String cidade;
	String uf;
	
	void cadastra(){
		cidade = JOptionPane.showInputDialog(null, "Cidade:");
		uf = JOptionPane.showInputDialog(null, "Unidade da Federação:");
	}
	
	public String toString(){ 
		return cidade + "("+uf+") \n";
	}
	
}
