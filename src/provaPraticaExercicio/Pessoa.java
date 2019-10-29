package provaPraticaExercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	
	@Override
	public String toString() {
		String rt = "";
		for (Vacina vacina : vacinas) {
			rt += vacina;
		}
		return "Nome: "+getNome()+"\n"
				+ "Idade: "+getIdade()+"\n"
						+ "------Vacinas------\n"+rt;
	}
	
	private String nome;
	private int idade;
	ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade(Meses):")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("")) {
			
		}else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade<=0) {
			
		}else {
			this.idade = idade;
		}
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
}
