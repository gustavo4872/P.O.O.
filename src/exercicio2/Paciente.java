package exercicio2;

import javax.swing.JOptionPane;

public class Paciente {
	String nome;
	String sexo;
	Medicamento med = new Medicamento();
	Medico medico = new Medico();

	void cadastrarPaciente(){
		nome = JOptionPane.showInputDialog("Nome do Paciente:");
		sexo = JOptionPane.showInputDialog("Sexo do Paciente:");
		med.cadastrarMedicamento();
		medico.cadastrarMedico();
	}
}
