package exercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public int getGolsTime() {
		int soma = 0;
		for (Jogador j : getJogadores()) {
			soma += j.getGols();
		}
		return soma;
	}
	
	public Jogador getArtilheiro() {
		Jogador oMelhor = new Jogador();
		for (Jogador j : getJogadores()) {
			if(j.getGols() > oMelhor.getGols()) {
				oMelhor = j;
			}
		}
		return oMelhor;
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Time"));
		String op = "";
		do {
			Jogador j = new Jogador();
			j.cadasatra();
			getJogadores().add(j);
			op = JOptionPane.showInputDialog("Mais jogadores?(S/N)");
		}while(op.equalsIgnoreCase("S"));
	}
	
	public String toString() {
		String ret = "*** "+getNome()+" ***\n";
		for (Jogador j : getJogadores()) {
			ret += j;
		}
		return ret;
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
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
