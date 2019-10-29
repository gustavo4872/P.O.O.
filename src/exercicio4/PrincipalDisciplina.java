package exercicio4;

import java.text.DecimalFormat;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class PrincipalDisciplina { ///////////////// 243 LINHAS NO TOTAL////////////////
	
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public static void main(String[] args) {
	
		String menu = "1 - Cadastrar \n"
				+ "2 - Listar Uma Disciplina\n"
				+ "3 - Disciplina com Mais Aprovações\n"
				+ "4 - Professor com Mais Reprovações\n"
				+ "5 - Professor Mais Velho Lecionando\n"
				+ "6 - Porcentagem de Sexo dos Professores\n"
				+ "0 - Sair";
		int op = 0;
		do {
			switch (op) {
			case 1:
				cadastraDisciplina();
				break;
			case 2:
				listaDisciplina();
				break;
			case 3:
				maisAprovacoesDisciplina();
				break;
			case 4:
				maisReprovacoesPorProfessor();
				break;
			case 5:
				professorMaisVelhoLeciona();
				break;
			case 6:
				percentualSexoProfessor();
				break;
			}
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}while(op != 0);
	}
	
	private static void cadastraDisciplina() {
		Disciplina d = new Disciplina();
		d.cadastra();
		disciplinas.add(d);
	}
	
	private static void listaDisciplina() {
		String disciplinaBusca = JOptionPane.showInputDialog("Nome da Disciplina:");
		for (Disciplina d : disciplinas) {
			if(d.getNome().equalsIgnoreCase(disciplinaBusca)) {
				JOptionPane.showMessageDialog(null, d);
			}
		}
	}
	
	private static void maisAprovacoesDisciplina() {
		Disciplina dMr = new Disciplina();
		for (Disciplina d : disciplinas) {
			if(dMr.aprovacoes() < d.aprovacoes()) {
				dMr = d;
			}
		}
		JOptionPane.showMessageDialog(null, dMr);
	}
	
	private static void maisReprovacoesPorProfessor() {
		Disciplina mRpP = new Disciplina();
		for (Disciplina disciplina : disciplinas) {
			if (mRpP.professorMaisReprovacoe() < disciplina.professorMaisReprovacoe()) {
				mRpP = disciplina;
			}
		}
		JOptionPane.showMessageDialog(null, mRpP);
	}
	
	public static void professorMaisVelhoLeciona() {
		Disciplina pMVL = new Disciplina();
		for (Disciplina d : disciplinas) {
			if (pMVL.getProfessor().getIdade() < d.getProfessor().getIdade()) {
				pMVL = d;
			}		
		}
		JOptionPane.showMessageDialog(null, pMVL);
	}
	
	public static void percentualSexoProfessor() {
		double masc = 0, fem = 0, total = 0;
		for (Disciplina d : disciplinas) {
			if (d.getProfessor().getSexo().equalsIgnoreCase("m")) {
				masc++;
			} else if (d.getProfessor().getSexo().equalsIgnoreCase("f")) {
				fem++;
			}
		}
		total = masc + fem;
		DecimalFormat df = new DecimalFormat("#.0");
		JOptionPane.showMessageDialog(null, "Professores do Sexo Feminino("+fem+"): "+df.format(((fem/total)*100))+"%\n"
				+ "Professores do Sexo Masculino("+masc+"):  "+df.format(((masc/total)*100))+"%");
	}
}