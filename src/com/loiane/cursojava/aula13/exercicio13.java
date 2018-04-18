package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio13 {
//PROGRAMA SALÁRIO BRUTO
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor por hora trabalhada e o número de horas trabalhadas em seguida.");
		float valor = scan.nextFloat();
		int horas = scan.nextInt();
		float salarioBruto = valor * horas;				
		float salarioLiquido, ir, inss, sindicato;
		ir = (salarioBruto * 11) / 100;
		inss = (salarioBruto * 8) / 100;
		sindicato = (salarioBruto * 5) / 100;
		salarioLiquido = salarioBruto - ir - inss - sindicato;
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Valor Imposto de Renda: R$" + ir);
		System.out.println("Valor INSS: R$" + inss);
		System.out.println("Valor Sindicato: R$" + sindicato);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		
	}

}
