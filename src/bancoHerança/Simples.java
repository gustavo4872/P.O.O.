package bancoHeran�a;

public class Simples extends Conta{
	
	public Simples() {
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "Limite de Saldo: SEM LIMITE\n"
				+ "Limite de Cr�dito: R$0.00\n";
	}
	
	@Override
	public void cadastra(Agencia a, Cliente c) {
		super.cadastra(a, c);
	}
}
