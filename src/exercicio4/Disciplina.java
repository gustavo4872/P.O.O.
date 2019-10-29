package exercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {

	private String nome;
	private Professor professor = new Professor();
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome da Disciplina:"));
		getProfessor().cadastra();
		String op = "";
		do {
		Aluno alunos = new Aluno();
		alunos.cadastra();
		getAlunos().add(alunos);
		op = JOptionPane.showInputDialog("Cadastrar outro Aluno?(Enter para Continuar)");
		}while(op.equals(""));
	}
	public String toString() {
		String disp = "Disciplina: "+getNome()+"\n"+getProfessor()+"\n"; 
		for (Aluno aluno : getAlunos()) {
			disp += aluno+"\n";
		}
		return disp;
	}
	
	public int aprovacoes() {
		int soma = 0;
		for (Aluno a : getAlunos()) {
			if (a.resultadoMedia().equalsIgnoreCase("Aprovado")) {
				soma += 1;
			}
		}
		return soma;
	}
	
	public int professorMaisReprovacoe() {
		int soma = 0;
		for (Aluno aluno : getAlunos()) {
			if (aluno.resultadoMedia() == "Reprovado") {
				soma += 1;
			}
		}
		return soma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals("")) {
			setNome(JOptionPane.showInputDialog("Nome Inválido(Vazio)"));
		}else {
			this.nome = nome;
		}
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}
