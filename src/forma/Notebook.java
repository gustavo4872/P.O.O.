package forma;

public class Notebook extends Computador {
	private int codigo;
	public Notebook() {
		System.out.println("Notebook");
		codigo = 1234;
	}
	@Override
	public void ligar() {
		System.out.println("Código: "+codigo);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
