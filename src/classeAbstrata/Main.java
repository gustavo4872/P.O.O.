package classeAbstrata;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.cadastra();
		JOptionPane.showMessageDialog(null, pessoa.toString());
	
	}
}
