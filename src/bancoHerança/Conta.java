package bancoHerança;

import bancoHerança.util.Constante;

public class Conta {
	
	public Conta() {
	}
	
	public String toString() {
		return "\n\n"+getAgencia()+"\n"
			 + getCliente()+"\n"
			 + "Saldo: R$"+getSaldo()+"0\n";
	}
	
	protected Agencia agencia;
	protected Cliente cliente;
	protected double saldo;
	
	public void cadastra(Agencia a, Cliente c) {
		setAgencia(a);
		setCliente(c);
	}
	
	public String saque(Double valorSaque) {
		if (valorSaque == 0) {
			return Constante.Valor_Zero;
		}else if ((getSaldo() - valorSaque) >= 0) {
			setSaldo(getSaldo()-valorSaque);
			return Constante.Saque_YES;
		}else {
			return Constante.Saque_NO;
		}
	}
	
	public String deposito(Double valorDeposito) {
		if (valorDeposito == 0) {
			return Constante.Valor_Zero;
		}else {
			setSaldo(getSaldo()+valorDeposito);
			return Constante.Deposito_YES;
		}
	}
	
	public static String transferencia(Conta origem, Conta destino, double valorDeposito) {
	
		if (origem.getAgencia().getNumero() == destino.getAgencia().getNumero() &&
			origem.getCliente().getNome().equalsIgnoreCase(destino.getCliente().getNome()) && 
			origem.getCliente().getIdade() == destino.getCliente().getIdade() &&
			origem.getCliente().getSexo()  == destino.getCliente().getSexo()) {
			if (origem instanceof Simples && destino instanceof Simples) {
				return Constante.Transferencia_NO;
			}else if (origem instanceof Especial && destino instanceof Especial) {
				return Constante.Transferencia_NO;
			}else if (origem instanceof Universitaria && destino instanceof Universitaria) {
				return Constante.Transferencia_NO;
			}
		}
		
		if (origem.getAgencia().getNumero() == destino.getAgencia().getNumero()) {
			double saldoOrigem = origem.getSaldo();
			double saldoDestino = destino.getSaldo();
			if (origem.saque(valorDeposito) == Constante.Saque_YES) {
				if (destino.deposito(valorDeposito) == Constante.Deposito_YES) {
					origem.setSaldo(saldoOrigem-valorDeposito);
					destino.setSaldo(saldoDestino+valorDeposito);
					return Constante.Transferencia_YES;
				}else {
					origem.setSaldo(saldoOrigem);
					destino.setSaldo(saldoDestino);
					return Constante.Transferencia_NO;
				}
			}else {
				origem.setSaldo(saldoOrigem);
				destino.setSaldo(saldoDestino);
				return Constante.Transferencia_NO;
			}
		}else {
			return Constante.Transferencia_NO;
		}
	}
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
