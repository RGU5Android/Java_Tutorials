package com.godzplay.arrayuse;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		int intArray[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : intArray) {
			System.out.print(i + "\t");
		}

		System.out.println();
		int value = 0;
		Scanner mScanner = new Scanner(System.in);

		int addTableOfFive[] = new int[10];
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter the table of Five: 5 * " + i + " = ");
			value = mScanner.nextInt();
			addTableOfFive[i - 1] = value;
		}

		System.out.println("Printing the table : ");
		for (int i : addTableOfFive) {
			System.out.print(i + "\t");
		}

		System.out
				.println("************************************************************************************************************");

		String nameArrayString[] = { "Rahul", "Uppalwar", "RGU", "GoDzPlaY" };
		for (String string : nameArrayString) {
			System.out.println("Name: " + string);
		}

		String[] userInputString = new String[10];
		for (int i = 0; i < userInputString.length; i++) {
			System.out.println("Enter your top 10 movie list: ");
			String movie = mScanner.next();
			userInputString[i] = movie;
		}

		for (String string : userInputString) {
			System.out.println("\tYour List : " + string);
		}

		if (mScanner != null) {
			mScanner.close();
		}

	}
}
