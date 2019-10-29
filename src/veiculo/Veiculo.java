package veiculo;

abstract class Veiculo {
	
	int velocidade;
	boolean status;
	
	public void ligar() {}
	
	public void desligar() {}
	
	public void mostraStatus() {}
	
	abstract void acelerar();
	
}
