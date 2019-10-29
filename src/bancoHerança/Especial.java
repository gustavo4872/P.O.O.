package bancoHeran�a;

import javax.swing.JOptionPane;

import bancoHeran�a.util.Constante;

public class Especial extends Conta{
	
	public Especial() {
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				  "Limite do Saldo: SEM LIMITE\n"
				+ "Limite de Cr�dito: R$"+getLimite()+"\n";
	}
	
	private double limite;
	
	@Override
	public void cadastra(Agencia a, Cliente c) {
		super.cadastra(a, c);
		setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite de Cr�dito:")));
	}
	
	public double getLimite() {  
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String saque(Double valorSaque) {
		if (valorSaque == 0) {
			return Constante.Valor_Zero;
		}else if ((saldo - valorSaque) >= (limite*-1)) {
			setSaldo(getSaldo() - valorSaque);
			return Constante.Saque_YES;
		}else {
			return Constante.Saque_NO;
		}
	}
}
