package farmaciaHeranca;

import javax.swing.JOptionPane;

public class Medicamento extends Produto {
	
	public Medicamento() {
	}
	
	@Override
	public String toString() {
		return "Medicamento: ";
	}
	
	private boolean reterReceita;
	String nomeMedico;
	
	@Override
	public void venda() {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		if ((getEstoque()-quantidade)>=0) {
			setEstoque(estoque);
		}else {
			JOptionPane.showMessageDialog(null, "Estoque Insuficiente!");
		}
		
	}

	public boolean isReterReceita() {
		return reterReceita;
	}

	public void setReterReceita(boolean reterReceita) {
		this.reterReceita = reterReceita;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

}