package exercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	static ArrayList<Paciente> pc = new ArrayList<Paciente>();
	
	public static void main(String[] args) {
		int op = 0;
		switch (op) {
		case 1:
			
			break;

		default:
			break;
		}
	
	}
	
	static void cadastraPessoa(){
		Paciente p = new Paciente();
		p.cadastrarPaciente();
		pc.add(p);
	}
	
	static void mostraNomePaciente(){
		String nomebusca = JOptionPane.showInputDialog("Nome do Paciente:");
		
	}
	
	static void mostraEspecialidadeMedico(){
		String especialidadeBusca = JOptionPane.showInputDialog("Nome da ");
	}
		
}
	
	
	

