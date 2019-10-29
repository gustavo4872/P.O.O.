package exercicio3;

import javax.swing.JOptionPane;

public class Jogador {
	
	private String nome;
	private int camisa;
	private int gols;
	
	public void cadasatra() {
		setNome(JOptionPane.showInputDialog("Nome do Jogador"));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Camisa")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("Qt Gols")));
	}
	
	public String toString() {
		return getNome()+" ("+getCamisa()+") - "+getGols()+"\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals(""))
			setNome(JOptionPane.showInputDialog("Iválido! Tente novamente"));
		else
			this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		if(camisa < 10 || camisa > 50)
			setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Iválido! Tente novamente")));
		else
			this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		if(gols < 0)
			setGols(Integer.parseInt(JOptionPane.showInputDialog("Iválido! Tente novamente")));
		else
			this.gols = gols;
	}
	
	

}
