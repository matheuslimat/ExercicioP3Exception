package Exercicio1e2;

import java.util.Scanner;

public class AppTest {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.print("Digite um valor pra deposito: ");
			conta.depositar(leFloat(teclado.nextLine()));
			System.out.print("Digite um valor pra saque: ");
			conta.sacar(leFloat(teclado.nextLine()));
			System.out.print("Digite um valor pra limite: ");
			conta.setValorLimite(leFloat(teclado.nextLine()));
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static float leFloat(String valor) {
		return Float.parseFloat(valor);
	}

}
