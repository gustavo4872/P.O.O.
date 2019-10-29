package farmacia;

import javax.swing.JOptionPane;

public class Cliente {
	
	public Cliente(){
		setdSaldo(0D);
	}
	
	public String toString() {
		return "Cliente: "+getsNome()+"\n"
			 + "Saldo: "+getdSaldo()+"\n\n";
	}
	
	private String sNome;
	private double dSaldo;
	
	public void cadastraCliente() {
		setsNome(JOptionPane.showInputDialog("Nome do Cliente:"));
	}
	
	public String getsNome() {
		return sNome;
	}

	public void setsNome(String sNome) {
		if (sNome.equals("")) {
			setsNome(JOptionPane.showInputDialog("Nome Inválido:"));
		} else {
			this.sNome = sNome;
		}
	}

	public double getdSaldo() {
		return dSaldo;
	}

	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}
	
	
}
