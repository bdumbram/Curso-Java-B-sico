package com.loiane.cursojava.aula20Labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[][][][] agenda = new String[13][32][18][18]; // matrix [month] [day] [hour] [appointment] 12 32 8 8 a matrix of 3X3 is enough, necessary to check the informed values
		int month=0,day = 0, hour = 0;
		String appointment = "";
		char keep;

		do {
			System.out.print("To schedule an appointment enter 's', to consult enter 'c', to exit the programm enter 'e'. ");
			keep = scan.next().charAt(0);

			agenda[6][15][8][8] = "dentist";

			if (keep == 's') {
				System.out.println("Scheduling...!!!\n\n");

				System.out.println("Inform the month to schedule the appointment in the agenda.");
				month = scan.nextInt();
				System.out.println("Inform the day of the month do schedule the appointment in the agenda.");
				day = scan.nextInt();
				System.out.println("Inform the hour of the appointment (between 9 AM to 17 PM).");
				hour = scan.nextInt();				
				System.out.println("Inform the appointment.");				
				appointment = scan.nextLine();				
				appointment = scan.nextLine();

				for (int i = 1; i < agenda.length; i++) {
					for (int j = 1; j < agenda[i].length; j++) {
						for (int k = 1; k <agenda[i][j].length; k++) {
							for (int l = 1; l<agenda[i][j][k].length; l++) {
								if (i == month) {
									if (j == day) {
										if (k == hour) {
											if (l == k) {
												agenda[i][j][k][l] = appointment;
												System.out.println("Scheduled Appointment\n" + "Month: " + i + " c"
														+ "day :" + j + " hour: " + k + " appointment: "
														+ agenda[i][j][k][l]);
											}
										}
									}

								}
							}

						}

					}
				}

			} else if (keep == 'c') {
				System.out.println("Appointment Query...!\n\n");

				System.out.println("Inform the month of the appointment.");
				month = scan.nextInt();
				System.out.println("Inform the day of the appointment.");
				day = scan.nextInt();
				System.out.println("Inform the hour of the appointment.");
				hour = scan.nextInt();

				for (int i = 1; i < agenda.length; i++) {
					for (int j = 1; j < agenda[i].length; j++) {
						for (int k = 1; k <agenda[i][j].length; k++) {
							for (int l = 1; l<agenda[i][j][k].length; l++) {
								if (i == month) {
									if (j == day) {
										if (k == hour) {
											if (l == k) {
												System.out.println("Month: " + i + " day :" + j + " hour: " + k + " appointment: " + agenda[i][j][k][l]);
											}
										}
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
