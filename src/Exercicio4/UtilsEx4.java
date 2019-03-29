package Exercicio4;

public class UtilsEx4 {

	public static final double ZERO_ABSOLUTO = -459.67;
	
	public static double converteToCelsius(double temp) throws FahrenheitException {
		
		if (temp < ZERO_ABSOLUTO) {
			throw new FahrenheitException();
		}
		else {
			return (5*(temp-32))/9;
		}
		
	}
}
