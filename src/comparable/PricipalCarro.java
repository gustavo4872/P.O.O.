package comparable;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PricipalCarro {
	
	private static ArrayList<Carro> lista = new ArrayList<Carro>();
	
	public static void main(String[] args) {
		
		String menu = 
				  "1 - Cadastrar \n"
				+ "2 - Ordenar Pela Placa\n"
				+ "3 - Ordenar Pela Modelo\n"
				+ "4 - Ordenar Pela Ano\n"
				+ "5 - Sair\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Carro c = new Carro();
				c.cadastra();
				lista.add(c);
				break;
			case 2:
				Ordenacao.ordenaPorPlaca(lista);
				listar();
				break;
			case 3:
				Ordenacao.ordenaPorModelo(lista);
				listar();
				break;
			case 4:
				Ordenacao.ordenaPorAno(lista);
				listar();
				break;
			}
		} while (op!=5);
		
	}

	private static void listar() {
		String resultado = "Carros Cadastrados:\n\n";
		for (Carro carro : lista) {
			resultado += carro;
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
	
}
