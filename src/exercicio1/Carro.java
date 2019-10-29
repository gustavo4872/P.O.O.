package exercicio1;

import javax.swing.JOptionPane;

public class Carro {
	
	int ano;
	String placa;
	String modelo;
	
	void cadastra(){
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:"));
		placa = JOptionPane.showInputDialog(null, "Placa:");
		modelo = JOptionPane.showInputDialog(null, "Modelo:");
	}
	
	String mostraDados(){
		return placa;
	}
	
	String carroNV(){
		String nv;
		if (ano >= 2016) {
			nv = "Novo";
		}else {
			nv = "Velho";
		}
		return nv;
	}
}

