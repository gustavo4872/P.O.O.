package farmaciaHeranca;

import javax.swing.JOptionPane;

public class Cliente {

	public Cliente() {
		setSaldo(0D);
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\n"
				+ "Saldo: "+getSaldo()+"\n";
	}
	
	private String nome;
	private double saldo;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome: "));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
		
}
