package Exercicio1e2;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;

	public void sacar(float valor) throws IllegalAccessException {

		if (valor <= saldo) {
			if (valor > 0) {
				this.saldo -= valor;
			}else {
				throw new IllegalAccessException("Valor inválido.");
			}
		}else {
			throw new IllegalAccessException("Você não possui saldo suficiente!");
		}
	}

	public void depositar(float valor) throws IllegalAccessException {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			throw new IllegalAccessException("Valor inválido.");
		}
	}

	public void setValorLimite(float valor) throws IllegalAccessException {

		if (valor < 0) {
			throw new IllegalAccessException("Valor inválido, tente um número maior ou igual a zero!");
		}else {
			this.valorLimite = valor;
		}

	}

}
