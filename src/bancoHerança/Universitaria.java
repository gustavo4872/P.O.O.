package bancoHerança;

import bancoHerança.util.Constante;

public class Universitaria extends Conta{
	
	public Universitaria() {
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				  "Limite de Saldo: R$3000.00\n"
				+ "Limite de Crédito: R$0.00\n";
	}
	
	@Override
	public String saque(Double valorSaque) {
		if (valorSaque == 0) {
			return Constante.Valor_Zero;
		}else if ((getSaldo()-valorSaque) >= 0) {
			super.saque(valorSaque);
			return Constante.Saque_YES;
		}else {
			return Constante.Saque_NO;
		}
	}
	
	@Override
	public String deposito(Double valorDeposito) {
		if (valorDeposito == 0) {
			return Constante.Valor_Zero;
		}else if ((getSaldo()+valorDeposito)<=3000D) {
			super.deposito(valorDeposito);
			return Constante.Deposito_YES;
		}else {
			return Constante.Deposito_NO;
		}
	}
}
