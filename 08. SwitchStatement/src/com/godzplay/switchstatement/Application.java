package com.godzplay.switchstatement;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);

		/**
		 * Switch is better than if in some cases.
		 */
		int value = 0;
		do {
			System.out.print("Enter the month number: ");
			value = mScanner.nextInt();
			switch (value) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("March");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("Aug");
				break;
			case 9:
				System.out.println("Sept");
				break;
			case 10:
				System.out.println("Oct");
				break;
			case 11:
				System.out.println("Nov");
				break;
			case 12:
				System.out.println("Dec");
				break;
			case 4:
				System.out.println("April");
				break;
			default:
				System.out.println("Matching month not found");
				break;
			}
		} while (value != 5);

		if (mScanner != null) {
			mScanner.close();
		}
		System.out.println("Done with basic building blocks.... :P");

	}

}
