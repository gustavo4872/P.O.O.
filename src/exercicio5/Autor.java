package exercicio5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autor {
	
	private String nome;
	private char sexo;
	private int idade;
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public void cadastra() {
		
		setNome(JOptionPane.showInputDialog("Nome do Autor(Nome e Sobrenome):"));
		setSexo(JOptionPane.showInputDialog("Sexo(M | F)").charAt(0));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
		
		String op = "";
		do {
		Livro l = new Livro();
		l.cadastra();
		getLivros().add(l);
		op = JOptionPane.showInputDialog("Outro Livro(Enter para Sim | N para N�o)");
		}while(op.equals(""));
		System.out.println(livros.size());
	}
	
	public String buscaLivroPre�o(double min, double max) {
		String ret = "";
		for (Livro l : getLivros()) {
			if (l.getPreco() >= min) {
				if (l.getPreco() <= max) {
					ret += l;
				}
			}
		}
		return ret;
	}
	
	public String toString() {
		return "\n\n"
				+ "Autor:"
				+ "Nome: "+getNome()+"\n"
				+ "Sexo: "+getSexo()+"\n"
				+ "Idade: "+getIdade()+"\n"
				+ "Livros: "
				+ getLivros();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.trim().indexOf(" ") == -1) {
			setNome(JOptionPane.showInputDialog("Nome Inv�lido(Nome e Sobrenome)"));
		}else {	
			this.nome = nome;
		}
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		if (sexo == 'M'||sexo == 'F') {
			this.sexo = sexo;
		}else {
			setSexo(JOptionPane.showInputDialog("Sexo Inv�lido(M | F)").charAt(0));
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0) {
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade Inv�lida(Negativa)")));
		}else {
			this.idade = idade;
		}
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livro) {
		this.livros = livro;
	}

}
