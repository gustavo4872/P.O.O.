package exercicio4;

import javax.swing.JOptionPane;

public class Professor {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Professor:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do Professor:")));
		setSexo(JOptionPane.showInputDialog("Sexo do Professor:"));
		//Se o sexo for char: JOptionPane.showInputDialog("Sexo do Professor:").toUppercase.charAt(0) .
	}
	public String toString() {
		return "Professor: "+getNome()+"\nIdade: "+getIdade()+"\nSexo:"+getSexo()+"\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.equals("")) {
			setNome("Nome Inválido(Vazio)");
		} else {
			this.nome = nome;
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
			this.sexo = sexo;
		} else {
			setSexo(JOptionPane.showInputDialog("Sexo Inválido(M ou F):"));
		}	
	}
}
	
