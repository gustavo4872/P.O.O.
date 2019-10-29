package exercicio5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PricipalLivros {
	
	private static ArrayList<Autor> autores = new ArrayList<Autor>();
	
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
				cadastrarLivros();
				break;
			case 2:
				listarLivros();
				break;
			case 3:
				procurarAutor();
				break;
			case 4:
				pesquisarFaixaValor();
				break;
			case 5:
				buscaAutorSexoMasculino();
				break;
			case 6:
				buscaAutorCrianca();
				break;
			}
		} while (op!=0);
		
	}
	
	private static void cadastrarLivros() {
		Autor a = new Autor();
		a.cadastra();
		autores.add(a);
	}
	
	private static void listarLivros() {
		String ret = "";
		for (Autor autor : autores) {
			ret += autor;
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void procurarAutor() {
		String pesquisa = JOptionPane.showInputDialog("Nome:");
		String ret = "";
		for (Autor autor : autores) {
			if (autor.getNome().equalsIgnoreCase(pesquisa)) {
				ret += autor;
			}
		}
		if (ret.equalsIgnoreCase("")) {
			JOptionPane.showMessageDialog(null, "Autor Não Encontrado!");
		} else {
			JOptionPane.showMessageDialog(null, ret);
		}
	}
	
	private static void pesquisarFaixaValor() {
		String ret = "";
		double min = Double.parseDouble(JOptionPane.showInputDialog("Valor Minimo:"));
		double max = Double.parseDouble(JOptionPane.showInputDialog("Valor Maximo:"));	
		for (Autor autor : autores) {
			ret += autor.buscaLivroPreço(min, max);
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void buscaAutorSexoMasculino() {
		String ret = "";
		for (Autor autor : autores) {
			if (autor.getSexo() == 'M') {
				ret += autor;
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	private static void buscaAutorCrianca() {
		String ret = "";
		for (Autor autor : autores) {
			if (autor.getIdade() <= 12) {
				ret += autor;
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}
}
