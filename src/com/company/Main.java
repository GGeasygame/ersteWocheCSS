package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Github Test");

		int number = (int) (Math.random()*(30));
		System.out.println(number);

		int tries = 0;
		while (tries < 9) {

			if (tries < 10) {
				int left = 9 - tries;
				System.out.println("Du hast " + left + " Versuche verbleibend");
				for (int t = 0; t <= 2; t++) {
					System.out.println("Versuchen Sie die Zahl herauszufinden.");
					Scanner scanner = new Scanner(System.in);
					int guess = scanner.nextInt();
					System.out.println(guess);
					if (guess == number) {
						System.out.println("Du hast es geschafft!");
						tries = 10;
						t = 3;
					} else if (guess > number) {
						System.out.println("Die gesuchte Zahl ist kleiner.");
					} else {
						System.out.println("Die gesuchte Zahl ist grösser.");
					}
					tries++;
				}


			}

		}
		if (tries == 9) {
			System.out.println("Sie haben verloren.");
		} else if (tries == 10) {
			System.out.println("Sie haben gewonnen.");
		}
	}
}
