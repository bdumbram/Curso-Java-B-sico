package com.loiane.cursojava.aula20Labs;

import java.util.Scanner;

public class testeJogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);			//Variable's Declaration
		char[] pos =  {'0','0','0','0','0','0','0','0','0'};
		int position = 0;
		char x  = 'X', o = 'O';
		boolean endGame = false;
		boolean posControl = true;
		boolean conditionToWin = false;
		String player = "";		
		
		System.out.println("Veja as posições de 0 a 8\n");
		if (pos[0]!='0') {System.out.print("\t\t   __" + pos[0]+"|");} else {System.out.print("\t\t   __0|");}
		if (pos[1]!='0') {System.out.print("__" + pos[1]+"|");} else {System.out.print("__1|");}
		if (pos[2]!='0') {System.out.print(pos[2]+"__");} else {System.out.print("2__");}
		if (pos[3]!='0') {System.out.print("\n\t\t   __" + pos[3]+"|");} else {System.out.print("\n\t\t   __3|");}
		if (pos[4]!='0') {System.out.print("__" + pos[4]+"|");} else {System.out.print("__4|");}
		if (pos[5]!='0') {System.out.print(pos[5]+"__");} else {System.out.print("5__");}
		if (pos[6]!='0') {System.out.print("\n\t\t     " + pos[6]+"|");} else {System.out.print("\n\t\t     6|");}
		if (pos[7]!='0') {System.out.print("__" + pos[7]+"|");} else {System.out.print("  7|");}
		if (pos[8]!='0') {System.out.println(pos[8]+"");} else {System.out.print("8 ");}
		System.out.println("\n");
		
		for (int i=0; i<5; i++) {			//Main loop to fill positions
						
			if(!endGame) {			//end the game if any player wins or the game draw.
				do {				// positions fill control.
					System.out.println("\nJogador 1 faça a " + (i+1) + "ª jogada");
					position = scan.nextInt();			

					for (int j=0; j<pos.length; j++) {		
						if(position == j) {
							if (pos[j]== '0') {
								pos[j] = x;
								posControl = true;
							}else {
								System.out.println("\nPosition is already filled\n");
								posControl = false;
							}								
						} 
					}
				}while(!posControl);				
				
				// board - rebuild needed.
				if (pos[0]!='0') {System.out.print("\t\t   __" + pos[0]+"|");} else {System.out.print("\t\t   __ |");}
				if (pos[1]!='0') {System.out.print("__" + pos[1]+"|");} else {System.out.print("__ |");}
				if (pos[2]!='0') {System.out.print(pos[2]+"__");} else {System.out.print(" __");}
				if (pos[3]!='0') {System.out.print("\n\t\t   __" + pos[3]+"|");} else {System.out.print("\n\t\t   __ |");}
				if (pos[4]!='0') {System.out.print("__" + pos[4]+"|");} else {System.out.print("__ |");}
				if (pos[5]!='0') {System.out.print(pos[5]+"__");} else {System.out.print(" __");}
				if (pos[6]!='0') {System.out.print("\n\t\t     " + pos[6]+"|");} else {System.out.print("\n\t\t      |");}
				if (pos[7]!='0') {System.out.print("__" + pos[7]+"|");} else {System.out.print("   |");}
				if (pos[8]!='0') {System.out.print(pos[8]+"");} else {System.out.print(" ");}
				
				for (int m=0; m<pos.length; m+=3) {		// condition to win 1, 2 and 3 for X and O
					if(pos[m]==x && pos[m+1]==x && pos[m+2]==x) {
						player = "Player 1";
						conditionToWin = true;
						endGame = true;						
					}
					if(pos[m]==o && pos[m+1]==o && pos[m+2]==o) {
						player = "Player 2";
						conditionToWin = true;
						endGame = true;
					}
				}
				
				if(pos[0]==x && pos[3]==x && pos[6]==x) { // condition to win 4 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[1]==x && pos[4]==x && pos[7]==x) { // condition to win 5 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[2]==x && pos[5]==x && pos[8]==x) { // condition to win 6 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==x && pos[4]==x && pos[8]==x) { // condition to win 7 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[6]==x && pos[4]==x && pos[2]==x) { // condition to win 8 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==o && pos[3]==o && pos[6]==o) { // condition to win 4 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[1]==o && pos[4]==o && pos[7]==o) { // condition to win 5 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[2]==o && pos[5]==o && pos[8]==o) { // condition to win 6 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==o && pos[4]==o && pos[8]==o) { // condition to win 7 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[6]==o && pos[4]==x && pos[2]==o) { // condition to win 8 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				

				if (i == 4) { // end the game at the last move.
					endGame = true;
				}
				if(endGame) { // end game.
					if (conditionToWin) {
						System.out.println("\nWinner: " + player);
					}else {
						System.out.println("\nDraw Game\n");	
					}					
					break;
				}

				do {
					System.out.println("\nJogador 2 faça a " + (i+1) + "ª jogada\"");
					position = scan.nextInt();

					for (int l=0; l<pos.length; l++) {		
						if(position == l) {
							if (pos[l]== '0') {
								pos[l] = o;
								posControl = true;
							}else {
								System.out.println("\nPosition is already filled\n");
								posControl = false;
							}								
						} 
					}
				}while(!posControl);

				if (pos[0]!='0') {System.out.print("\t\t   __" + pos[0]+"|");} else {System.out.print("\t\t   __ |");}
				if (pos[1]!='0') {System.out.print("__" + pos[1]+"|");} else {System.out.print("__ |");}
				if (pos[2]!='0') {System.out.print(pos[2]+"__");} else {System.out.print(" __");}
				if (pos[3]!='0') {System.out.print("\n\t\t   __" + pos[3]+"|");} else {System.out.print("\n\t\t   __ |");}
				if (pos[4]!='0') {System.out.print("__" + pos[4]+"|");} else {System.out.print("__ |");}
				if (pos[5]!='0') {System.out.print(pos[5]+"__");} else {System.out.print(" __");}
				if (pos[6]!='0') {System.out.print("\n\t\t     " + pos[6]+"|");} else {System.out.print("\n\t\t      |");}
				if (pos[7]!='0') {System.out.print("__" + pos[7]+"|");} else {System.out.print("   |");}
				if (pos[8]!='0') {System.out.print(pos[8]+"");} else {System.out.print(" ");}
				
				for (int m=0; m<pos.length; m+=3) {		// condition to win 1, 2 and 3 for X and O
					if(pos[m]==x && pos[m+1]==x && pos[m+2]==x) {
						player = "Player 1";
						conditionToWin = true;
						endGame = true;						
					}
					if(pos[m]==o && pos[m+1]==o && pos[m+2]==o) {
						player = "Player 2";
						conditionToWin = true;
						endGame = true;
					}
				}
				
				if(pos[0]==x && pos[3]==x && pos[6]==x) { // condition to win 4 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[1]==x && pos[4]==x && pos[7]==x) { // condition to win 5 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[2]==x && pos[5]==x && pos[8]==x) { // condition to win 6 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==x && pos[4]==x && pos[8]==x) { // condition to win 7 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[6]==x && pos[4]==x && pos[2]==x) { // condition to win 8 for X
					player = "Player 1";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==o && pos[3]==o && pos[6]==o) { // condition to win 4 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[1]==o && pos[4]==o && pos[7]==o) { // condition to win 5 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[2]==o && pos[5]==o && pos[8]==o) { // condition to win 6 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[0]==o && pos[4]==o && pos[8]==o) { // condition to win 7 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				if(pos[6]==o && pos[4]==x && pos[2]==o) { // condition to win 8 for O
					player = "Player 2";
					conditionToWin = true;
					endGame = true;
				}
				

				if (i == 4) { // end the game at the last move.
					endGame = true;
				}
				if(endGame) { // end game.
					if (conditionToWin) {
						System.out.println("\nWinner: " + player);
					}else {
						System.out.println("\nDraw Game\n");	
					}					
					break;
				}
				
			}


		}
	}
}
