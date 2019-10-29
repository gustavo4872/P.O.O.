package veiculo;

public class Main {
	public static void main(String[] args) {
		Veiculo v = new Passageiro();
		v = (Aviao)v;
		if (v instanceof Passageiro) {
			System.out.println("É Passageiro");
		}
	}
}