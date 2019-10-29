package bancoHerança;

import javax.swing.JOptionPane;

public class Agencia {
	
	public Agencia(){
	}
	
	public String toString() {
		return "Agência: "+getNumero()+"\n"
				+ "Cidade: "+getCidade()+"\n"
						+ "Bairro: "+getBairro();
	}
	
	private float numero;
	private String cidade;
	private String bairro;
	//Math.round(Math.random())
	public void cadastra(float numero) {
		setNumero(numero);
		setCidade(JOptionPane.showInputDialog("Cidade:"));
		setBairro(JOptionPane.showInputDialog("Bairro:"));
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
