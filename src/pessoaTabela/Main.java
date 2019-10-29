package pessoaTabela;

import java.util.ArrayList;

public class Main {

	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.cadastra();
		pessoas.add(p);
		Pessoa p2 = new Pessoa();
		p2.cadastra();
		pessoas.add(p2);
		mostraTabela(pessoas); 
	}
	
	public static void mostraTabela(ArrayList<Pessoa> pessoas) {
		Object [][] dadosMandar = new Object [pessoas.size()][3]; 
		for (int i = 0; i < pessoas.size(); i++) {
			dadosMandar[i][0] = pessoas.get(i).getNome();
			dadosMandar[i][1] = pessoas.get(i).getIdade();
			dadosMandar[i][2] = pessoas.get(i).getCpf();
		}
		 
		Tabela lc = new Tabela(dadosMandar);
        lc.criaJanela();
	}

}
