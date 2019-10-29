package exercicio5;

import javax.swing.JOptionPane;

public class Livro {

	private String titulo;
	private double preco;

	
	public void cadastra() {
		setTitulo(JOptionPane.showInputDialog("Titulo:"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço(Acima de 0.00):")));
	}
	
	public String toString() {
		return    "\nTitulo: "+getTitulo().toLowerCase()+" "
				+ "Preço: R$"+getPreco();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo.equals("")) {
			setTitulo(JOptionPane.showInputDialog("Titulo Inválido:"));
		} else {
			this.titulo = titulo;
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco <= 0) {
			setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço Inválido:")));
		}else {
			this.preco = preco;
		}
	}
}
