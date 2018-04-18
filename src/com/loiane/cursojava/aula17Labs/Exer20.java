package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de pessoas/idades.");
		int qtdIdade = scan.nextInt(), soma=0;
		int idade, jovem=0, adulto=0, idoso=0, media=0;		
		
		for (int i = 1; i <= qtdIdade; i++) {
			System.out.println("Entre com a idade " + i);
			idade = scan.nextInt();
			soma += idade;			
			/*if (idade >= 0 && idade <=25) {
				jovem++;
			}else if (idade >25 && idade <=60) {
				adulto++;
			}else if(idade > 60) {
				idoso++;
			}*/			
		}
		
		media = soma;
		media = media / qtdIdade;
		if(media <= 25) {
			System.out.println("Turma Jovem - idade média: " + media);
		}else if (media > 25 && media <= 60) {
			System.out.println("Turma Adulta - idade média: " + media);
		}else {
			System.out.println("Turma Idosa - idade média: " + media);
		}
		
		/*if (jovem > adulto && jovem > idoso) {
			System.out.println("Turma Jovem");
		}else if (adulto > jovem && adulto > idoso) {
			System.out.println("Turma Adulta");
		}else if (idoso > jovem && idoso > adulto) {
			System.out.println("Turma Idosa");
		}*/

	}

}
