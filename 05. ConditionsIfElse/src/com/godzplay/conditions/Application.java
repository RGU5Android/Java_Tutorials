package com.godzplay.conditions;

public class Application {

	public static void main(String[] args) {
		String mName = "Rahul";
		int mAge = 25;
		boolean mGender = true; // True -> male & false -> female

		/**
		 * Using if-else with int, string and boolean
		 */

		System.out.println("***********Using Boolean***********");
		if (mGender) {
			System.out.println("I AM MALE");
		} else {
			System.out.println("I AM FEMALE");
		}

		System.out.println("***********Using Strings***********");
		if (mName.equalsIgnoreCase("rahul")) {
			System.out.println("Yes it's correct, my name is " + mName);
		} else if (mName.equals("Priyanka")) {
			System.out.println("No it's incorrect");
		}

		System.out.println("***********Using Integer***********");
		if (mAge == 20) {
			System.out.println("My age is : " + mAge);
		} else if (mAge >= 30) {
			System.out.println("M tooo old... :(");
		} else {
			System.out.println("My age is : " + mAge);
		}

		/**
		 * Using loops with conditions
		 */

		/**
		 * Infinite loop ends when age = 50; Loop is skipped using break
		 * statement
		 */
		System.out
				.println("***********Breaking an infinite loop using conditions***********");
		while (true) {
			mAge++;
			if (mAge == 50) {
				System.out.println("I AM DONE");
				break;
			} else {
				System.out.println("Now my age is : " + mAge);
			}
		}
	}
}
