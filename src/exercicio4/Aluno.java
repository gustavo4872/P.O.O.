package exercicio4;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nome;
	ArrayList<Double> notas = new ArrayList<Double>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Aluno:"));
		double n;
		for (int i = 0; i < 3; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Nota "+(i+1)+":"));
			getNotas().add(n);
		}
	}
	
	public String toString() {
		double media = 0;
		DecimalFormat df = new DecimalFormat("0.0");
		for (Double n : getNotas()) {
			media += n;
		}
		return "Aluno: "+getNome()+""
				+ "\nNota: "+getNotas()+""
				+ "\nMédia:"+df.format(media/3)
				+"\nSituação: "+resultadoMedia()+"\n";
	}
	public String resultadoMedia() {
		String ret = "";
		double media = 0;
		for (Double n : getNotas()) {
			media += n;
		}
		if ((media/3)>2&&(media/3)<7) {
			ret = "Recuperação";
		}else if ((media/3)<=2) {
			ret = "Reprovado";
		}else {
			ret = "Aprovado";
		}
		return ret;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.equals("")) {
			setNome("Nome Inválido(Vazio):");
		} else {
			this.nome = nome;
		}
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
}
