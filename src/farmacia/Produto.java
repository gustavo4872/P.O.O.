package farmacia;

import javax.swing.JOptionPane;

public class Produto {
	
	Produto(){
		sNome="";
		iEstoque=0;
		dValor=0D;
	}
	
	public String toString() {
		return "Nome: "+getsNome()+"\n"
			 + "Estoque: "+getiEstoque()+"\n"
			 + "Valor: "+getdValor()+"\n\n";
	}
	
	private String sNome;
	private int iEstoque;
	private double dValor;
	
	public void cadastraProduto() {
		setsNome(JOptionPane.showInputDialog("Nome do Produto"));
		setiEstoque(Integer.parseInt(JOptionPane.showInputDialog("Quantidade no Estoque:")));
		setdValor(Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto:")));
	}
	
	public String getsNome() {
		return sNome;
	}

	public void setsNome(String sNome) {
		if (sNome.equals("")) {
			setsNome(JOptionPane.showInputDialog("Nome Inválido:"));
		} else {
			this.sNome = sNome;
		}
	}

	public int getiEstoque() {
		return iEstoque;
	}

	public void setiEstoque(int iEstoque) {
		this.iEstoque = iEstoque;
	}

	public double getdValor() {
		return dValor;
	}

	public void setdValor(double dValor) {
		if (dValor <= 0) {
			setdValor(Double.parseDouble(JOptionPane.showInputDialog("Valor Inválido:")));
		} else {
			this.dValor = dValor;
		}
	}
	
	
}
