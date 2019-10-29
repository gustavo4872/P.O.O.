package banco;

import javax.swing.JOptionPane;

public class Agencia {
	
	public Agencia(){
	}
	
	public String toString() {
		return "Número da Agência:"+getNumero()+"\n"
			 + "Cidade: "+getCidade()+"\n"
			 + "Bairro: "+getBairro()+"\n\n";
	}
	
	private int numero;
	private String cidade;
	private String bairro;
	
	
	public void cadastraAgencia() {
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero:")));
		setCidade(JOptionPane.showInputDialog("Cidade:"));
		setBairro(JOptionPane.showInputDialog("Bairro:"));
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
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
