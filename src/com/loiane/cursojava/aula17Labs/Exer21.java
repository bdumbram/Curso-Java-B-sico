package com.loiane.cursojava.aula17Labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de turmas.");

		int qtdTurmas = scan.nextInt();
		int count = 1, mediaAlunos = 0;
		int qtdAlunos = 0;

		while (count <= qtdTurmas) {
			do {
				System.out.println("Digite a quantidade de alunos para a " + count + "ª turma.");
				qtdAlunos = scan.nextInt();

				if (qtdAlunos > 40) {
					System.out.println("Quantidade não pode ser maior que 40.");
				}
			} while (qtdAlunos > 40);
			count++;
			mediaAlunos = mediaAlunos + qtdAlunos;
		}

		mediaAlunos = mediaAlunos / qtdTurmas;

		System.out.println("Media de alunos é: " + mediaAlunos);

	}
}
