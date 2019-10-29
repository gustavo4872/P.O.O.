package herança;

import javax.swing.JOptionPane;

public class Medico extends Pessoa{
	
	public String toString() {
		return super.toString()+"CRM:"+getCrm()+"\n";
	}
	
	protected int crm;
	
	public void cadastra() {
		setCrm(Integer.parseInt(JOptionPane.showInputDialog("CRM:")));
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
	
}
