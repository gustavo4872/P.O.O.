package farmaciaHeranca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static void main(String[] args) {
		
		String menu = "0 - Sair \n"
				+ "1 - Cadastrar \n"
				+ "2 - Listar Todos Os Livros Cadastrados\n"
				+ "3 - Pesquisar Por Autor\n"
				+ "4 - Pesquisar Por Faixa De Valor\n"
				+ "5 - Todos Os Livros De Autores Masculinos\n"
				+ "6 - Todos Os Livros De Autores Crianças\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraCliente();
				break;
			case 2:
				cadastraProduto();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		} while (op!=0);
	}
	
	private static void cadastraCliente() {
		Cliente c = new Cliente();
		c.cadastra();
		clientes.add(c);
	}

	private static void cadastraProduto() {
		String menu = "0 - Sair \n"
				+ "1 - Cadastrar Medicamento\n"
				+ "2 - Cadastrar Equipamento Médico\n"
				+ "3 - Cadastrar Perfumaria\n";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Medicamento novoMed = new Medicamento();
				novoMed.cadastra();
				produtos.add(novoMed);
				break;
			case 2:
				EquipamentoMedico novoEquipM = new EquipamentoMedico();
				novoEquipM.cadastra();
				produtos.add(novoEquipM);
				break;
			case 3:
				Perfumaria novoPerf = new Perfumaria();
				novoPerf.cadastra();
				produtos.add(novoPerf);
				break;
			}
		} while (op!=0);
	}
	
}