package farmacia;

import java.util.ArrayList;

import farmacia.util.Constantes;

public class Venda {
	
	public String toString() {
		return "Produtos Vendidos: "+getProdutos();
	}
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public String vender(Cliente c, Produto p, int qt) {
		if (p.getiEstoque()>=qt) {
			p.setiEstoque(p.getiEstoque() - qt);
			double total = qt * p.getdValor();
			c.setdSaldo(c.getdSaldo() + total);
			produtos.add(p);
			return Constantes.Venda_Yes;
		}
		return Constantes.Venda_No;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
