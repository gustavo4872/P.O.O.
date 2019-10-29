package farmaciaHeranca;

import javax.swing.JOptionPane;

public abstract class Produto {

	public Produto() {
		cadastra();
	}
	
	@Override
	public String toString() {
		return "Nome do Produto: "+getNome()+"\n"
				+ "Estoque: "+getEstoque()+"\n"
						+ "Valor: "+getValor();
	}
	
	protected String nome;
	protected int estoque;
	protected double valor;
	protected int opcao;
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do Produto: "));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Estoque: ")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
	}
	
	public void venda() {
		setEstoque(getEstoque()-(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "))));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}