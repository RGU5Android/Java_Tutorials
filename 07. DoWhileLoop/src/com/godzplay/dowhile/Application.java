package com.godzplay.dowhile;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/**
		 * using do while loop. This is used when the user want to execute a
		 * snippet atleast once and ignoring the condition. Once it's executed
		 * then check for condition. If condition holds true then rerun the same
		 * code else exist.
		 */
		Scanner mScanner = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter the number: ");
			value = mScanner.nextInt();
			System.out.println("Number Entered is : " + value);

		} while (value != 5);

		System.out.println("Hey, it's done");

		if (mScanner != null) {
			mScanner.close();
		}
	}
}
