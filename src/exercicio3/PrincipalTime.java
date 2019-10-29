package exercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalTime {
	
	private static ArrayList<Time> times = new ArrayList<Time>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar time\n"
				+ "2 - Listar jogadores de um time\n"
				+ "3 - Verificar artilheiro campenonato\n"
				+ "4 - Time com mais gols\n\n"
				+ "5 - Sair";
		int op = 0;
		do {
			switch (op) {
			case 1:
				cadastrarTime();
				break;
			case 2:
				listaJogadoresTime();
				break;
			case 3:
				artilheiroCampeonato();
				break;
			case 4:
				timeComMaisGols();
				break;

			}
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}while(op != 5);
	}
	
	private static void cadastrarTime() {
		Time t = new Time();
		t.cadastra();
		times.add(t);
	}
	
	private static void listaJogadoresTime() {
		String timeBusca = JOptionPane.showInputDialog("Qual time?");
		for (Time t : times) {
			if(t.getNome().equalsIgnoreCase(timeBusca))
				JOptionPane.showMessageDialog(null, t);
		}
	}
	
	private static void artilheiroCampeonato() {
		Jogador artilheiro = new Jogador();
		for (Time t : times) {
			if(t.getArtilheiro().getGols() > artilheiro.getGols()) {
				artilheiro = t.getArtilheiro();
			}
		}
		JOptionPane.showMessageDialog(null, artilheiro);
	}
	
	private static void timeComMaisGols() {
		Time tmaisGols = new Time();
		for (Time t : times) {
			if(t.getGolsTime() > tmaisGols.getGolsTime()) {
				tmaisGols = t;
			}
		}
		JOptionPane.showMessageDialog(null, tmaisGols);
	}

}
