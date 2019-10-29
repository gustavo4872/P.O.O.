package comparable;

import javax.swing.JOptionPane;

public class Carro {
	
	public String toString() {
		return "Placa: "+getPlaca()+"\n"
				+ "Ano: "+getAno()+"\n"
						+ "Modelo: "+getModelo()+"\n\n";
	}
	
	private String placa;
	private int ano;
	private String modelo;
	
	public void cadastra() {
		setPlaca(JOptionPane.showInputDialog("Placa: "));
		setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));
		setModelo(JOptionPane.showInputDialog("Modelo: "));
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
