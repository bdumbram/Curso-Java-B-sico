package com.loiane.cursojava.aula27Labs;

public class TesteContaCorrete {

	public static void main(String[] args) {
		
		Exer2_Conta_Corrente CC_Bruno = new Exer2_Conta_Corrente ();
		
		CC_Bruno.numConta = 123456;
		CC_Bruno.saldoConta = 700;
		CC_Bruno.saldoLimite = 0;
		CC_Bruno.contaEspecial = true;
		CC_Bruno.limiteChequeEspecial = 3000;
		CC_Bruno.permitirSaque = true;
		
		double fazerSaque = CC_Bruno.realizarSaque(CC_Bruno.numConta);		
		CC_Bruno.consultarSaldo();
		CC_Bruno.verificarChequeEspecial();
		fazerSaque = CC_Bruno.realizarSaque(CC_Bruno.numConta);
		CC_Bruno.consultarSaldo();
		CC_Bruno.verificarChequeEspecial();
		double depDinheiro = CC_Bruno.depositarDinheiro();
		CC_Bruno.consultarSaldo();
		CC_Bruno.verificarChequeEspecial();
		
	}

}
