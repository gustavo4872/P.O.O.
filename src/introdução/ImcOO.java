package introdução;

import javax.swing.JOptionPane;

public class ImcOO {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[1];
		String result = "*** Resultado ***\n\n";
		
		for (int i = 0; i < 1; i++) {
			Pessoa p = new Pessoa();
			p.cadastro();
			pessoas[i] = p;
			result += p.mostraDados();
		}
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
