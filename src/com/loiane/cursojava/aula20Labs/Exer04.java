package com.loiane.cursojava.aula20Labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[][][] agenda = new String[32][25][25]; // matrix [day] [hour] [appointment] 32 25 25 // matrix 3X3 isn't necessary, 2X2 is enough
		int day = 0, hour = 0;
		String appointment = "";
		char keep;
		boolean check=false;

		do {
			System.out.print(
					"To schedule an appointment enter 's', to consult enter 'c', to exit the programm enter 'e'.");
			keep = scan.next().charAt(0);

			agenda[15][8][8] = "dentist";

			if (keep == 's') { //add appointment
				
				System.out.println("Scheduling...!!!");

				while (!check) {
					System.out.println("Inform the day of the month do schedule the appointment in the calendar/agenda");
					day = scan.nextInt();
					if (day <= 0 || day > 31) {
						check = false;
						System.out.println("Please, enter a valid value!");
					} else {
						check = true;
					}
				}
				check = false;
				while (!check) {
					System.out.println("Inform the hour of the appointment");
					hour = scan.nextInt();
					if (hour < 0 || hour > 24) {
						check = false;
						System.out.println("Please, enter a valid value!");
					} else {
						check = true;
					}
				}
				check = false;				
				System.out.println("Inform the appointment");
				appointment = scan.nextLine();
				appointment = scan.nextLine();

				for (int i = 1; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						for (int k = 0; k < agenda[i][j].length; k++) {
							if (i == day) {
								if (j == hour) {
									if (k == j) {
										agenda[i][j][k] = appointment;
										System.out.println("Appointment Scheduled\n" + "day :" + i + " hour: " + j + " appointment: " + agenda[i][j][k]);

									}
								}

							}
						}

					}

				}

			} else if (keep == 'c') { // consult appointment

				System.out.println("Inform the appointment's day of the month to consult the calendar/agenda");
				day = scan.nextInt();
				System.out.println("Inform the hour of the appointment");
				hour = scan.nextInt();

				for (int i = 1; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						for (int k = 0; k < agenda[i][j].length; k++) {
							if (i == day) {
								if (j == hour) {
									if (k == j) {

										System.out.println(
												"day :" + i + " hour: " + j + " appointment: " + agenda[i][j][k]);										

									}
								}

							}

						}

					}

				}

			} else if (keep == 'e') {
				System.out.println("Exiting the programm! - Bye");
			} else {
				System.out.println("Wrong input!!");
			}
		} while (keep != 'e');

	}

}
