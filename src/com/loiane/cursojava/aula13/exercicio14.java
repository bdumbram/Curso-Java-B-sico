package com.loiane.cursojava.aula13;
import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
		
		double arquivo, linkInternet;
		double tempoAproximado;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MBs: ");
		arquivo = scan.nextFloat();
		System.out.println("Digite a velocidade do link de Internet em Mbps: ");
		linkInternet = scan.nextFloat();
		
		tempoAproximado = (arquivo / linkInternet) * 0.01;
		System.out.println("O tempo aproximado de download do arquivo em minutos é de: " + tempoAproximado);		

	}

}
