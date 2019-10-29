package aula2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalDepto {
	
	static ArrayList<Departamento> deptos = new ArrayList<Departamento>();
	
	public static void main(String[] args) {
			int op = 0;
			do {
				op = retornaMenu();
				switch (op) {
				case 1:
					cadastrarDepto();
					break;
				case 2:
					listarDeptos();
					break;
				case 3:
					listaGerentePorCidade();
					break;
				case 4:
					listaGerentePorSexo();
					break;
				}
			} while (op != 5);
	}
	
	static void cadastrarDepto(){
		Departamento d = new Departamento();
		d.cadastra();
		deptos.add(d);
	}
	
	static void listarDeptos(){
		String ret = "*** DEPARTAMENTO(S) CADASTRADO(S) ***\n\n";
		for (Departamento d : deptos) {
			ret += d;
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static int retornaMenu(){
		String menu = "1 - Cadastrar Departamento\n"
				+ "2 - Listar Todos\n"
				+ "3 - Buscar Gerente por Cidade\n"
				+ "4 - Buscar Gerente po Sexo\n"
				+ "5 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
				
	}
	
	static void listaGerentePorCidade(){
		String cidadeBusca = JOptionPane.showInputDialog("Qual Cidade?");
		String ret = "";
		for (Departamento d : deptos) {
			if (cidadeBusca.equalsIgnoreCase(d.gerente.endereco.cidade)) {
				ret += d.gerente+"\n";
			}
		}
		if(ret.equals("")){
			ret = "NÃO FORAM ENCONTRADOS NENHUM GERENTE";
		}
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static void listaGerentePorSexo(){
		String sexoBusca = JOptionPane.showInputDialog("Qual Sexo?");
		String ret = "";
		for (Departamento d : deptos) {
			if (sexoBusca.equalsIgnoreCase(d.gerente.sexo)) {
				ret += d.gerente+"\n";
			}
		}
		if (ret.equals("")) {
			ret = "NÃO FORAM ENCONTRADOS NENHUM GERENTE";
		}
		JOptionPane.showMessageDialog(null, ret);
	}

}
