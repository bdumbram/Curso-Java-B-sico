package com.loiane.cursojava.aula27Labs;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	String [] disciplinas = new String [3];
	double [] medias = new double [3];
	
	boolean verificarAprovacao (String disciplina) {
		
		boolean aprovado = false;
		for (int i=0;i<3;i++){ //(int media : medias) //for each????			
			if (disciplina == disciplinas[i]) {
				System.out.println("Disciplina: " + disciplina);
				System.out.println("Média: " + medias[i]);
				if (medias[i] >= 7) {
					aprovado = true;
					System.out.println("Aluno: " + nome + "\nMatricula: " + matricula + "\nCurso: " +
									   curso + "\nAprovado: " + aprovado);break;
				}else {
					System.out.println("Aluno: " + nome + "\nAprovado: " + aprovado);break;
				}
			}else {
				if (i>1) {
					System.out.println("Disciplina '" + disciplina + "' não cadastrada!");
				}
				
			}
			
		}
		
		return aprovado;
	}

}
