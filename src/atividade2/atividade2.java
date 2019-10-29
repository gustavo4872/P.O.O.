package atividade2;

import javax.swing.JOptionPane;

class Pessoas {
	String nome;
	String sexo;
	String codigo;
	public String toString() {
		return "\n nome "+nome+"\n codigo "+codigo+"\n sexo "+sexo;
	}
}

class Dia {
	String dia;
	String codigo;
	public String toString() {
		return "\n dia "+dia;
	}
}

public class atividade2 {

	public static void main(String[] args) {
		Pessoas [] cadastro = new Pessoas[2];
		Dia [] verifica = new Dia [2];
		for (int i = 0; i < cadastro.length; i++) {
			cadastro[i]=new Pessoas();
			cadastro[i].nome=JOptionPane.showInputDialog("nome");
			cadastro[i].codigo=JOptionPane.showInputDialog("codigo");
			cadastro[i].sexo=JOptionPane.showInputDialog("sexo");
		}
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Dias da Semana(1 - 7)"));
		do {
			for (int i = 0; i < verifica.length; i++) {
				verifica[i].dia = JOptionPane.showInputDialog("Dia da Semana");
				String cd = JOptionPane.showInputDialog("");
			}
		} while (x>=1 && x<=7);
	}
	
	static String codigo(Dia[] verifica,Pessoas [] cadastro) {
		for (int i = 0; i < verifica.length; i++) {
			for (int j = 0; j < verifica.length; j++) {
				if(verifica[i].codigo.equalsIgnoreCase(cadastro[j].codigo)){
					return cadastro[j].toString();
				}
			}
		}
		 return "não encontrado";
	}

}
