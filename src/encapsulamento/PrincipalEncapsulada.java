package encapsulamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalEncapsulada {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		 int op = 0;
		do{ 
		String menu = "1 - Cadastrar\n"
		 		+ "2 - Buscar por Cidade\n"
		 		+ "3 - Sair";
		
		 op = Integer.parseInt(JOptionPane.showInputDialog("Opção"));
		 if (op == 1) {
			cadastra();
		}
		 if (op == 2) {
			buscaCidade();
		}
		}while(op != 3);
		
	}
	
	private static void cadastra(){
		Pessoa p = new Pessoa();
		p.cadastra();
		pessoas.add(p);
	}
	
	private static void buscaCidade(){
		String cidadeBusca = JOptionPane.showInputDialog("Qual a cidade");
		String ret = "";
		for (Pessoa p : pessoas) {
			if (p.getCidade().getNome().equalsIgnoreCase(cidadeBusca)) {
				ret += p;
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}

}
