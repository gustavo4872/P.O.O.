package heterogenio4;

import javax.swing.JOptionPane;

class escola {
	String nome;
	String data;
	aluno[] a = new aluno[1];

	public void Cadastro() {
		nome = JOptionPane.showInputDialog("nome da escola ");
		data = JOptionPane.showInputDialog("data que ela foi inaugurada");
		for (int i = 0; i < a.length; i++) {
			a[i] = new aluno();
			a[i].Cadastro();
		}
	}

	public String busca(String x) {
		for (int i = 0; i < a.length; i++) {
			if (x.equals(a[i].nome)) {
					return nome;
			}
		}
		return "não tem";
	}

	public String toString() {
		String volta = "";
		for (int i = 0; i < a.length; i++) {
			volta += a[i];
		}
		return "\n nome escola " + nome + "\n data de fundação " + data + volta;
	}
}

class aluno {
	String nome;
	int idade;
	char sexo;

	public void Cadastro() {
		nome = JOptionPane.showInputDialog("nome do aluno");
		idade = Integer.parseInt(JOptionPane.showInputDialog("idade"));
		sexo = JOptionPane.showInputDialog("sexo").charAt(0);
	}

	public String toString() {
		return " \n nome aluno " + nome + " \n idade aluno " + idade + " \n sexo aluno " + sexo;
	}
}

public class telefone {

	public static void main(String[] args) {
		escola[] n = new escola[2];
		aluno[] a = new aluno[1];
		for (int i = 0; i < n.length; i++) {
			escola ca = new escola();
			ca.Cadastro();
			n[i] = new escola();
			n[i] = ca;
		}
		for (int i = 0; i < n.length; i++) {
			JOptionPane.showMessageDialog(null, n[i]);
		}
		String y = JOptionPane.showInputDialog("qual nome vc busca ");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].a.length; j++) {
				if (n[i].a[j].nome.equalsIgnoreCase(y)) {
					JOptionPane.showMessageDialog(null, n[i]);
				}
			}
		}
	}

}
