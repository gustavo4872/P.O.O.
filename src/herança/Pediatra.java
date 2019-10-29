package herança;

import javax.swing.JOptionPane;

public class Pediatra extends Medico{
	
	public String toString() {
		return super.toString()+"Idade Máx:"+idadeMax+"\n";
	}
	
	private int idadeMax;
	
	public void cadastra() {
		setIdadeMax(Integer.parseInt(JOptionPane.showInputDialog("Idade Máxima:")));
	}

	public int getIdadeMax() {
		return idadeMax;
	}

	public void setIdadeMax(int idadeMax) {
		this.idadeMax = idadeMax;
	}
	
	
}
