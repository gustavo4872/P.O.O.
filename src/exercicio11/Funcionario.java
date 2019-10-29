package exercicio11;

public abstract class Funcionario {
	
	private String nome;
	private double renda;
	
	abstract void cadastra();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	
}
