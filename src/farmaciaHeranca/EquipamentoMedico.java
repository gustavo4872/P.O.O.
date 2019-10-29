package farmaciaHeranca;

import javax.swing.JOptionPane;

public class EquipamentoMedico extends Produto{
	
	public EquipamentoMedico() {
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void venda() {
		setEstoque(getEstoque()-(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "))));
	}
	
}
