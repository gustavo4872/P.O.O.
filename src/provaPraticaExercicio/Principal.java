package provaPraticaExercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	
	public static void main(String[] args) {
		String menu = "0 - Sair \n"
				+ "1 - Cadastrar Vacina \n"
				+ "2 - Cadastrar Pessoa \n"
				+ "3 - Mostrar Vacina\n"
				+ "4 - Mostrar Pessoa\n";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastrarVacina();
				break;
			case 2:
				cadastraPessoa();
				break;
			case 3:
				mostraVacina(); 
				break;
			case 4:
				mostraPessoa();
				break;
			case 5:
				mostraPessoaTabela(pessoas);
				break;
			case 6:
				break;
			}
		} while (op!=0);

	}
	
	private static void mostraPessoaTabela(ArrayList<Pessoa> pessoas) {
		Object[][] dadosMandar = new Object[pessoas.size()][4];
		for (int i = 0; i < dadosMandar.length; i++) {
			dadosMandar[i][0] = pessoas.get(i).getNome();
			dadosMandar[i][1] = pessoas.get(i).getIdade();
		}
		Tabela tPessoa = new Tabela(dadosMandar);
		tPessoa.criaJanela();
	}

	private static void cadastrarVacina() {
		Vacina vacina = new Vacina();
		vacina.cadastra();
		vacinas.add(vacina);
	}
	
	private static void mostraVacina() {
		String rt = "";
		for (Vacina vacina : vacinas) {
			rt += vacina;
		}
		JOptionPane.showMessageDialog(null, rt);
	}
	
	private static void cadastraPessoa() {
		Pessoa newPessoa = new Pessoa();
		newPessoa.cadastra();
		pessoas.add(newPessoa);
		String op =JOptionPane.showInputDialog("Cadastrar Vacina(Enter - Sim)?");
		if (op.equalsIgnoreCase("")) {
			do {
				adicionaVacina(newPessoa);
				op = JOptionPane.showInputDialog("Adicionar nova Vacina para Pessoa(Enter - Sim)?");
			} while (op.equalsIgnoreCase(""));
		}else {
			return;
		}
	}
	
	private static void mostraPessoa() {
		String rt = "";
		for (Pessoa pessoa : pessoas) {
			rt += pessoa;
		}
		JOptionPane.showMessageDialog(null, rt);
	}
	
	private static void adicionaVacina(Pessoa pessoa) {
		if (vacinas.isEmpty()==false) {
			String retorno = "";
			int iterator = 1;
			for (Vacina vacina : vacinas) {
				retorno += iterator++ + "\n";
				retorno += vacina;
			}
			int op = Integer.parseInt(JOptionPane.showInputDialog(null,retorno+"\n\n Opção:"));
			if (vacinas.size()<=op) {
				if (pessoa.getVacinas().contains(vacinas.get(op-1))) {
					JOptionPane.showMessageDialog(null, "Vacina Já Cadastrada para "+pessoa.getNome()+"!");
				}else {
					ArrayList<Vacina> vacinasObjeto = pessoa.getVacinas();
					vacinasObjeto.add(vacinas.get(op-1));
					pessoa.setVacinas(vacinasObjeto);
				}
			}
		}else {
			String op = JOptionPane.showInputDialog("Sem Vacina(s) Cadastrada(s)!\nCadastrar Vacina(Enter - Sim)?");
			if (op.equalsIgnoreCase("")) {
				cadastrarVacina();
				return;
			}else {
				return;
			}
		}
		
	}
	
	
	
}
