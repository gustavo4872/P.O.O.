package introdução;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		String[] nomes = new String[1];
		double[] imcs = new double[1];
		double peso, altura;
		
		for (int i = 0; i < nomes.length; i++) {
			
			nomes[i] = JOptionPane.showInputDialog(null, "nomes");
			
			peso   = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso"));
			altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura"));
			
			imcs[i] = (peso/java.lang.Math.pow(altura, 2));
			
			System.out.println("nomes:"+nomes[i]);
			System.out.println("imcs:"+imcs[i]);
		}
		
	}

}
