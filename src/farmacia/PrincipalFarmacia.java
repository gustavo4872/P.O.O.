package farmacia;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class PrincipalFarmacia {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static void main(String[] args) {
		
		String menu = "0 - Sair \n"
				+ "1 - Cadastrar Produto\n"
				+ "2 - Listar Produto\n"
				+ "3 - Cadastrar Cliente\n"
				+ "4 - Listar Cliente\n"
				+ "5 - Cadastrar Venda\n"
				+ "6 - Listar Venda\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraProduto();
				break;
			case 2:
				listaProduto();
				break;
			case 3:
				cadastraCliente();
				break;
			case 4:
				listaCliente();
				break;
			case 5:
				cadastraVenda();
				break;
			case 6:
				break;
			}
		} while (op!=0);
		

	}
	
//------------------------------------------PRODUTO	
	
	private static void cadastraProduto() {
		Produto p = new Produto();
		p.cadastraProduto();
		produtos.add(p);
	}
	
	private static void listaProduto() {
		String str = "";
		for (Produto p : produtos) {
			str += p;
		}
		JOptionPane.showMessageDialog(null, "Produtos:\n"+str);
	}
	
	private static Produto localizaProduto() {
		String produtosCad = "PRODUTOS CADASTRADOS\n\n";
		for (int i = 0; i < produtos.size(); i++) {
			produtosCad += (i+1) + " - "+produtos.get(i).getsNome()+"\n";
		}
		int indice = Integer.parseInt(JOptionPane.showInputDialog(produtosCad));
		return produtos.get(indice-1);
	}
	
//-----------------------------------------CLIENTE
	
	private static void cadastraCliente() {
		Cliente c = new Cliente();
		c.cadastraCliente();
		clientes.add(c);
	}
	
	private static void listaCliente() {
		String str = "";
		for (Cliente c : clientes) {
			str += c;
		}
		JOptionPane.showMessageDialog(null, "Clientes:\n"+str);
	}
	
	private static Cliente localizaCliente() {
		String clientesCad = "CLIENTES CADASTRADOS\n\n";
		for (int i = 0; i < clientes.size(); i++) {
			clientesCad += (i+1) + " - "+clientes.get(i).getsNome()+"\n";
		}
		int indice = Integer.parseInt(JOptionPane.showInputDialog(clientesCad));
		return clientes.get(indice-1);
	}
	
//---------------------------------------------------------VENDA	
	
	private static void cadastraVenda() {
		Venda   v = new Venda();
		Cliente c = localizaCliente();
		String mais = "S";
		
		while (mais.equalsIgnoreCase("s")) {
			Produto p = localizaProduto();
			int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
			JOptionPane.showMessageDialog(null, v.vender(c, p, qt));
			mais = JOptionPane.showInputDialog("Incluir mais Produtos?(S/N)");
		}
	}

}
