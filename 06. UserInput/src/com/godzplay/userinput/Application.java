package com.godzplay.userinput;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/**
		 * We will be using the scanner class the read inputs from user.
		 */
		Scanner mScanner = new Scanner(System.in);
		String mNameString = null;
		int mAge = 0;

		System.out.print("Enter Name: ");
		mNameString = mScanner.next();

		System.out.print("Enter Age: ");
		mAge = mScanner.nextInt();

		System.out
				.println("My name is " + mNameString + " & my age is " + mAge);

		/**
		 * Always call the Scanner close() method when we are done using Scanner
		 * object
		 */
		if (mScanner != null) {
			mScanner.close();
		}
	}
}
