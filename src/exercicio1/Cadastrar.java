package exercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cadastrar {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		String opcao;
		do {
			Carro c = new Carro();
			c.cadastra();
			carros.add(c);
			opcao = JOptionPane.showInputDialog(null, "Continuar(S/N)");			
		} while (opcao.equalsIgnoreCase("S"));
		
		for (Carro c : carros) {
			JOptionPane.showMessageDialog(null, c.mostraDados() + "\n" + c.carroNV());
		}
		
	}

}
