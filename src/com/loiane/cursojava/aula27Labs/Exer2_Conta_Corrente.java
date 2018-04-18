package com.loiane.cursojava.aula27Labs;
import java.util.Scanner;
import java.util.Base64.Decoder;

public class Exer2_Conta_Corrente {
	
	Scanner scan = new Scanner(System.in);
	// Declaração de variaveis da classe
	int numConta;
	double saldoConta;
	double limiteChequeEspecial;
	double saldoLimite; // variavel para controlar o quanto foi sacado
	boolean contaEspecial;
	boolean permitirSaque;	
	
	//Declaração de métodos
	double realizarSaque (int p_conta) { //boolean permitirSaqueFlag //entra com a conta como parametro para confirmar se existe a conta e se permite saque 		
		
		System.out.println("\nRealizando Saque\n");
		double valorSacado=0;
		System.out.println("Digite o valor desejado para saque: ");
		valorSacado= scan.nextDouble();
		if(valorSacado <= saldoConta) {
			permitirSaque = true;			
		}else if((saldoConta + (limiteChequeEspecial-saldoLimite) >= valorSacado)) { //(saldoLimite + valorSacado) <= limiteChequeEspecial
			permitirSaque = true;
		 }else {
			permitirSaque = false;
			System.out.println("Valor desejado é maior que o limite permitido para saque");
			System.out.println("Valor permitido para saque: " + (saldoConta + limiteChequeEspecial-saldoLimite));
		  }
		if(permitirSaque) {
			System.out.println("Valor solicitado: " + valorSacado);
			if(saldoConta >= valorSacado) {
				saldoConta -= valorSacado;
			}else if (saldoConta < valorSacado && saldoConta > 0) {
				saldoLimite += (valorSacado-saldoConta);
				saldoConta = 0;
			}
		}
		return valorSacado;
	}
	
	double depositarDinheiro () {
		
		System.out.println("\nRealizando Depósito\n");
		double valorDepositado=0;
		System.out.println("Informe a conta para deposito: ");
		int contaDep = scan.nextInt();
		if(contaDep == numConta) {
			System.out.println("Informe o valor a ser depositado: ");
			valorDepositado = scan.nextDouble();
			if(saldoLimite <= 0) {
				saldoConta += valorDepositado;				
			}else if(valorDepositado <= saldoLimite && valorDepositado > 0) {
				saldoLimite -= valorDepositado;
			}else {
				saldoConta = valorDepositado - saldoLimite;
				saldoLimite = 0;
			}				
			System.out.println("Conta de deposito: " + contaDep +
				               "\nValor depositado.: " + valorDepositado);
		}else {
			System.out.println("Conta não existe"); // fazer um loop para entrar conta correta
		}
		return valorDepositado;
	}
	
	void consultarSaldo () {
		
		System.out.println("\nConsultando Saldo\n");
		System.out.println("Conta Corrente: " + numConta +
				           "\nSaldo.........:" + saldoConta);		
	}
	
	void verificarChequeEspecial () {
		
		System.out.println("\nConsultando Cheque Especial\n");
		if (saldoLimite > 0) {
			System.out.println("Cheque Especial em uso"	+
							   "\nLimite Cheque Especial: " + limiteChequeEspecial + 
							   "\nSaldo do limite: " + saldoLimite);
		}else {
			System.out.println("Limite do Cheque Especial não esta em uso");
		}
		
	}
	

}
