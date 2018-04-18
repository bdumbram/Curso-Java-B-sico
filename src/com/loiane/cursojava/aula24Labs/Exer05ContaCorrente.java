package com.loiane.cursojava.aula24Labs;

public class Exer05ContaCorrente {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.accountAgency = 1234;
		conta.accountBalance = 3589.60;
		conta.accountLimit = 15000;
		conta.accountNumber = 101309;
		conta.accountSpecial = true;
		
		
		System.out.println("Saldo da Conta " + conta.accountNumber + " = R$ " + conta.accountBalance);
	}

}
