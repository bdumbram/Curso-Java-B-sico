package com.loiane.cursojava.aula27Labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno Bruno = new Aluno();
		Bruno.curso = "ADS";
		Bruno.disciplinas[0] = "Ciencias";
		Bruno.disciplinas[1] = "Matematica";
		Bruno.disciplinas[2] = "Programacao";
		Bruno.matricula = "RA112233";
		Bruno.medias[0] = 5;
		Bruno.medias[1] = 8;
		Bruno.medias[2] = 9;
		Bruno.nome = "Bruno";
				
		Scanner scan = new Scanner(System.in);
		//String Disciplina="";
		System.out.println("Informe a disciplina para verificar aprovação: ");
		String Disciplina = scan.next();
		if (Disciplina == "Ciencias") {System.out.println(1);}
		boolean alunoAprovado = Bruno.verificarAprovacao(Disciplina);
		//alunoAprovado = Bruno.verificarAprovacao("Matematica");
		//alunoAprovado = Bruno.verificarAprovacao("Programacao");
		//System.out.println("Aluno: " + Bruno.nome + "\nAprovado: " + alunoAprovado);
	}

}
