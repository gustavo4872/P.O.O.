package provaPraticaExercicio;

import javax.swing.JOptionPane;

public class Vacina {
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\n"
				+ "Idade Mínima: "+getIdade()+"\n"
						+ "Doses: "+getDoses()+"\n\n";
	}
	
	private String nome;
	private int idade;
	private int doses;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome da Vacina:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade para Aplicação(Meses):")));
		setDoses(Integer.parseInt(JOptionPane.showInputDialog("Doses:")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("")) {
			setNome(JOptionPane.showInputDialog("Nome da Vacina:"));
		}else {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade<=0) {
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade para Aplicação(Meses):")));
		}else {
			this.idade = idade;
		}
	}

	public int getDoses() {
		return doses;
	}

	public void setDoses(int doses) {
		if (doses<=0) {
			setDoses(Integer.parseInt(JOptionPane.showInputDialog("Doses:")));
		}else {
			this.doses = doses;
		}
	}
	
	
}
