package herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import exercicio1.Cadastrar;

public class Main {
	
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private static ArrayList<Pediatra> pediatras = new ArrayList<Pediatra>();
	
	public static void main(String[] args) {
			
			String menu = "0 - Sair \n"
						+ "1 - Cadastrar Aluno\n"
						+ "2 - Cadastrar Pediatras\n"
						+ "3 - Listar Todos Alunos(Dados Completos)\n"
						+ "4 - Listar Todos Pediatras(Dados Completos)\n";
			
			int op = 0;
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (op) {
				case 1:
					cadastrarAluno();
					break;
				case 2:
					cadastraPediatra();
					break;
				case 3:
					listarAlunos();
					break;
				case 4:
					listarPediatra();
					break;
				}
			} while (op!=0);
	}
	
	private static void cadastrarAluno() {
		Aluno a = new Aluno();
		a.cadastra();
		alunos.add(a);
	}
	
	private static void cadastraPediatra() {
		Pediatra p = new Pediatra();
		p.cadastra();
		pediatras.add(p);
	}
	
	private static void listarAlunos() {
		String str = "";
		for (Aluno a : alunos) {
			str += a;
		}
		JOptionPane.showMessageDialog(null, str);
	}
	
	private static void listarPediatra() {
		String str = "";
		for (Pediatra a : pediatras) {
			str += a;
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
