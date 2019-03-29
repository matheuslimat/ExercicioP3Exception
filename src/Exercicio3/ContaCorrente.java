package Exercicio3;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;

	public void sacar(float valor) throws Exception {

		if (valor <= saldo) {
			if (valor > 0) {
				this.saldo -= valor;
			}else {
				throw new Exception("Valor inválido.");
			}
		}else {
			throw new Exception("Você não possui saldo suficiente!");
		}
	}

	public void depositar(float valor) throws Exception {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			throw new Exception("Valor inválido.");
		}
	}

	public void setValorLimite(float valor) throws Exception {

		if (valor < 0) {
			throw new Exception("Valor inválido, tente um número maior ou igual a zero!");
		}else {
			this.valorLimite = valor;
		}

	}

}
