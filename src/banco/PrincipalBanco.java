package banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalBanco {

	private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public static void main(String[] args) {
		
		String menu = "0 - Sair \n"
				+ "1 - Cadastrar Agência\n"
				+ "2 - Cadastrar Cliente\n"
				+ "3 - Cadastrar Conta\n"
				+ "4 - Listar Conta\n"
				+ "5 - Depósito\n"
				+ "6 - Saque\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraAgencia();
				break;
			case 2:
				cadastraCliente();
				break;
			case 3:
				cadastraConta();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
		} while (op!=0);
		
	}
	
	private static void cadastraAgencia() {
		Agencia a = new Agencia();
		a.cadastraAgencia();
		agencias.add(a);
	}
	
	private static void cadastraCliente() {
		Cliente c = new Cliente();
		c.cadastraCliente();
		clientes.add(c);
	}
	
	private static void cadastraConta() {
	}
	
}
