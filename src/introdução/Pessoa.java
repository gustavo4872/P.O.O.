package introdução;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	double peso;
	double altura;
	
	double calculaImc(){
		return peso/(java.lang.Math.pow(altura, 2));
	}
	
	String mostraDados(){
		return nome + " - " + arredonda(calculaImc());
	}
	
	void cadastro(){
		nome = JOptionPane.showInputDialog("Nome:");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
	}
	
	String arredonda(double imc){
		DecimalFormat df = new DecimalFormat("###.00");
		return df.format(imc);
	}
}
