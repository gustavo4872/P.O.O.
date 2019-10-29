package bancoHerança;

import java.util.ArrayList;
/*
 * @author : Gustavo4872
 */
import bancoHerança.util.Constante;

import javax.swing.JOptionPane;

public class PrincipalBH {
	
	static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static void main(String[] args) {	
		String menu = "0 - Sair \n"
				    + "1 - Cadastrar Agência\n"
				    + "2 - Cadastrar Cliente\n"
				    + "3 - Cadastrar Conta\n"
				    + "4 - Saque\n"
				    + "5 - Depósito\n"
				    + "6 - Transferência\n"
				    + "7 - Lista Conta";
		
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
				saque();
				break;
			case 5:
				deposito();
				break;
			case 6:
				transferencia();
				break;
			case 7:
				listaConta();
				break;
			}
		} while (op!=0);
		
	}

	
	private static String nome() {
		String nome = JOptionPane.showInputDialog("Nome do Cliente: ");
		return nome;
	}
	
	
	private static void mostraResultado(String rst) {
		JOptionPane.showMessageDialog(null, rst);
	}
	
	private static int menuTipoContas() {
		int tipoSelecionado = Integer.parseInt(JOptionPane.showInputDialog(
				  "0 - Cancelar \n"
				+ "1 - Conta Simples \n"
				+ "2 - Conta Especial \n"
				+ "3 - Conta Universitária"));
		return tipoSelecionado;
	}
	
	private static String clientetemConta(int agencia, String  cliente, int tipoConta) {
		for (Conta conta : contas) {
			if (conta.getAgencia().getNumero()==agencia && conta.getCliente().getNome().equalsIgnoreCase(cliente)) {
				if (conta instanceof Simples && tipoConta == 1 
						|| conta instanceof Especial && tipoConta == 2
							|| conta instanceof Universitaria && tipoConta == 3) {
					return Constante.Conta_Cadastrada_YES;
				}
			}
		}
		return Constante.Conta_Cadastrada_NO;
	}
	
	private static void listaConta() {
		String rt = "";
		for (Conta conta : contas) {
			rt += conta;
		}
		JOptionPane.showMessageDialog(null, rt);
	}
	
	private static boolean tipoContaTrasferencia(Conta c, int tipo) {
		if (c instanceof Simples && tipo == 1) {
			return true;
		}
		if (c instanceof Especial && tipo == 2) {
			return true;
		}
		if (c instanceof Universitaria && tipo == 3) {
			return true;
		}
		return false;
	}
		
	private static void clienteNaoCadastrado() {
		mostraResultado(Constante.Cliente_Cadastro_NO);
		String opcao = JOptionPane.showInputDialog("Cadastrar Cliente(ENTER)?");
		if (opcao.equalsIgnoreCase("")) {
			cadastraCliente();
			return;
		}
	}
	
	private static void agenciaNaoCadastrada() {
		mostraResultado(Constante.Agencia_Cadastro_NO);
		String opcao = JOptionPane.showInputDialog("Cadastrar Agência(ENTER)?");
		if (opcao.equalsIgnoreCase("")) {
			cadastraAgencia();
			return;
		}
	}
	
	private static void contaNaoCadastrada() {
		mostraResultado(Constante.Conta_Cadastro_NO);
		String opcao = JOptionPane.showInputDialog("Cadastrar Agência(ENTER)?");
		if (opcao.equalsIgnoreCase("")) {
			cadastraAgencia();
			return;
		}
	}
	
	private static void cadastraAgencia() {
		float numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Número da Agência:"));
		if (numeroAgencia == 0) {
			mostraResultado(Constante.Valor_Zero);
			return;
		}
		if (agencias.size()==0) {
			Agencia novaAgencia = new Agencia();
			novaAgencia.cadastra(numeroAgencia);
			agencias.add(novaAgencia);
			mostraResultado(Constante.Agencia_Cadastro_YES+"\n"+novaAgencia.toString());
			return;
		}else {
			for (int i = 0; i < agencias.size(); i++) {
				if (agencias.get(i).getNumero()  ==numeroAgencia) {
					mostraResultado(Constante.Agencia_Cadastrada_YES);
					cadastraAgencia();
					return;
				}
			}		
		}
		Agencia novaAgencia = new Agencia();
		novaAgencia.cadastra(numeroAgencia);
		agencias.add(novaAgencia);
		mostraResultado(novaAgencia.toString());
	}
	
	private static void cadastraCliente() {
		Cliente novoCliente = new Cliente();
		novoCliente.cadastra();
		clientes.add(novoCliente);
		mostraResultado(Constante.Cliente_Cadastro_YES+"\n"+novoCliente.toString());
	}

	private static void cadastraConta() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Conta!\nNúmero da Agência:"));
		for (Agencia agencia : agencias) {
			if (agencia.getNumero() == numero) {
				String nomeCliente = nome();
				for (Cliente cliente : clientes) {
					if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
						int tipoConta = menuTipoContas();
						if (clientetemConta(numero, nomeCliente, tipoConta).equalsIgnoreCase(Constante.Conta_Cadastrada_YES)) {
							mostraResultado(Constante.Conta_Cadastrada_YES);
							return;
						}
						switch (tipoConta) {
							case 1:
								Conta contaSimples = new Simples();
								contaSimples.cadastra(agencia, cliente);
								contas.add(contaSimples);
								mostraResultado(Constante.Conta_Cadastro_YES+contaSimples.toString());
								return;
							case 2:
								Conta contaEspecial = new Especial();
								contaEspecial.cadastra(agencia, cliente);
								contas.add(contaEspecial);
								mostraResultado(Constante.Conta_Cadastro_YES);
								return;
							case 3:
								Conta contaUni = new Universitaria();
								contaUni.cadastra(agencia, cliente);
								contas.add(contaUni);
								mostraResultado(Constante.Conta_Cadastro_YES);
								return;
							case 0:
								mostraResultado(Constante.Cadastro_Conta_Cancelado);
								return;
							default:
								mostraResultado(Constante.Valor_Zero);
								cadastraConta();
								return;
						}
					}
				}
				clienteNaoCadastrado();
				return;
			}
		}
		agenciaNaoCadastrada();
		return;
	}

	private static void saque() {
		double numeroAgencia = Double.parseDouble(JOptionPane.showInputDialog("Número da Agência:"));
		String nomeCliente = nome();
		int tipoConta = menuTipoContas();
		for (Conta conta : contas) {
			if (conta.getAgencia().getNumero() == numeroAgencia && conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
				switch (tipoConta) {
					case 1:
						if (conta instanceof Simples) {
							mostraResultado(conta.saque(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Saque:"))));
							return;
						}
						break;
					case 2:
						if (conta instanceof Especial) {
							mostraResultado(conta.saque(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Saque:"))));
							return;
						}
						break;
					case 3:
						if (conta instanceof Universitaria) {
							mostraResultado(conta.saque(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Saque:"))));
							return;
						}
						break;
				}
			}
		}
		contaNaoCadastrada();
		return;
	}
	
	private static void deposito() {
		double numeroAgencia = Double.parseDouble(JOptionPane.showInputDialog("Número da Agência:"));
		String nomeCliente = nome();
		int tipoConta = menuTipoContas();
		for (Conta conta : contas) {
			if (conta.getAgencia().getNumero() == numeroAgencia && conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
				switch (tipoConta) {
					case 1:
						if (conta instanceof Simples) {
							mostraResultado(conta.deposito(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Depósito:"))));
							return;
						}
						break;
					case 2:
						if (conta instanceof Especial) {
							mostraResultado(conta.deposito(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Depósito:"))));
							return;
						}
						break;
					case 3:
						if (conta instanceof Universitaria) {
							mostraResultado(conta.deposito(Double.parseDouble(
							JOptionPane.showInputDialog(conta.toString()+"Valor do Depósito:"))));
							return;
						}
						break;
				}
			}
		}
		contaNaoCadastrada();
		return;
	}
	
	private static void transferencia() {
		if (contas.size()<2) {
			mostraResultado("Necessário 02 Contas Cadastradas!\nContas Cadastradas: 0"+contas.size());
			String op = JOptionPane.showInputDialog("Cadastrar Contas(ENTER)?");
			if (op.equalsIgnoreCase("")) {
				cadastraConta();
				if (contas.size()==0) {
					return;
				}
				op = JOptionPane.showInputDialog("Cadastrar Outra Conta(ENTER)?");
				if (op.equalsIgnoreCase("")) {
					cadastraCliente();
					cadastraConta();	
				}else if (contas.size()<2) {
					mostraResultado("Contas Insuficientes!");
					return;
				}
			}else {
				return;
			}
		}
		boolean agenciaExiste = false;
		boolean origemExiste = false;
		boolean destinoExiste = false;
		String nomeClienteOrigem = "";
		int tipoConta = 0;
		float codigoAgencia = Integer.parseInt(JOptionPane.showInputDialog("Transferência Entre Contas!\nNúmero da Agência:"));
		for (Conta contaOrigem : contas) {
			if (contaOrigem.getAgencia().getNumero() == codigoAgencia) {
				if (agenciaExiste == false) {
					nomeClienteOrigem = JOptionPane.showInputDialog("Nome do Cliente - Origem");
					tipoConta = menuTipoContas();
				}
				agenciaExiste = true;
				if (contaOrigem.getCliente().getNome().equalsIgnoreCase(nomeClienteOrigem) && 
						tipoContaTrasferencia(contaOrigem, tipoConta) == true) {
					origemExiste = true;
					String nomeClienteDestino = JOptionPane.showInputDialog("Nome do Cliente - Destino");
					tipoConta = menuTipoContas();
					for (Conta contaDestino : contas) {
						if (contaDestino.getAgencia().getNumero() == codigoAgencia && 
								contaDestino.getCliente().getNome().equalsIgnoreCase(nomeClienteDestino)) {
							if (tipoContaTrasferencia(contaDestino, tipoConta) == true) {
								destinoExiste = true;
								double valorTrasferencia = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
								if (valorTrasferencia != 0) {
									mostraResultado(Conta.transferencia(contaOrigem, contaDestino, valorTrasferencia));
								}else {
									mostraResultado(Constante.Valor_Zero);
									return;
								}
							}
						}
					}
					return;
				}
			}
		}
		if (agenciaExiste == false) {
			String op = JOptionPane.showInputDialog(Constante.Agencia_Cadastro_NO+"\nCadastrar Agência(ENTER)?");
			if (op.equalsIgnoreCase("")) {
				cadastraAgencia();
			}else {
				return;
			}
		}else if (origemExiste == false) {
			String op = JOptionPane.showInputDialog(Constante.Conta_Cadastrada_NO+" - Origem!"+"\nCadastrar Conta(ENTER)?");
			if (op.equalsIgnoreCase("")) {
				cadastraConta();
			}else {
				return;
			}
		}else if (destinoExiste == false) {
			String op = JOptionPane.showInputDialog(Constante.Cliente_Cadastrado_NO+" - Destino!"+"\nCadastrar Cliente(ENTER)?");
			if (op.equalsIgnoreCase("")) {
				cadastraCliente();
			}else {
				return;
			}
		}else {
			return;
		}
	}
}