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
				throw new Exception("Valor inv�lido.");
			}
		}else {
			throw new Exception("Voc� n�o possui saldo suficiente!");
		}
	}

	public void depositar(float valor) throws Exception {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			throw new Exception("Valor inv�lido.");
		}
	}

	public void setValorLimite(float valor) throws Exception {

		if (valor < 0) {
			throw new Exception("Valor inv�lido, tente um n�mero maior ou igual a zero!");
		}else {
			this.valorLimite = valor;
		}

	}

}
