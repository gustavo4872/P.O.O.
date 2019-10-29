package aula2;

import javax.swing.JOptionPane;

public class Carro {
	
	int ano;
	String placa;
	String marca;
	
	void cadastra(){
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:"));
		placa = JOptionPane.showInputDialog(null, "Placa:");
		marca = JOptionPane.showInputDialog(null, "Marca:");
	}
	
	
	public String toString(){
		String estado = ano<2016?"Velho":"Novo";
		return "Carro: " + marca + " " + estado;
	}
}

