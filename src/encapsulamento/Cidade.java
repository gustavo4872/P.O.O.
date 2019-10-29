package encapsulamento;

import javax.swing.JOptionPane;

public class Cidade {
	
	private String nome;
	private String uf;
	
	public void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome:"));
		setUf(JOptionPane.showInputDialog("UF"));
	}
	
	public String toString() {
		return getNome() + "(" + getUf() + ")";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()>0) {
			this.nome = nome;
		}else{
			setNome(JOptionPane.showInputDialog("Incorreto! Informe Novamente"));
		}
	}
	public String getUf() {
		return uf.toUpperCase();
	}
	public void setUf(String uf) {
		if (uf.length()>0) {
			this.uf = uf;
		}else{
			setUf(JOptionPane.showInputDialog("Incorreto! Informe Novamente"));
		}
	}
	
	
	
}
