package Exercicio5e7;

public class SaldoInsuficienteException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(float saldo) {
		super("Saldo insuficiente, voc� possui R$ " + saldo);
	}

}
