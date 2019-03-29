package Exercicio4;

public class FahrenheitException extends TemperatureException {
	private static final long serialVersionUID = 1L;
	
	public FahrenheitException() {
		super("Valor Abaixo de Zero Absoluto.");
	}

}
