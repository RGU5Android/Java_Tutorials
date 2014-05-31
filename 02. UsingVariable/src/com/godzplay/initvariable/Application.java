package com.godzplay.initvariable;

public class Application {
	public static void main(String[] args) {
		/**
		 * There are total 8 primitive types of variable int short long float
		 * double char byte - 2^8 (-128 to 127) boolean
		 */

		/**
		 * In Java double should be preferred over float.
		 */
		int mInt = 100;
		long mLong = 1000;
		short mShort = 10;
		float mFloat = 100.123f;
		double mDouble = 2304.23;
		char mChar = 'R';
		byte mByte = 127;
		boolean mBoolean = true;

		System.out.println("Int: " + mInt);
		System.out.println("Long: " + mLong);
		System.out.println("Short: " + mShort);
		System.out.println("Double: " + mDouble);
		System.out.println("Float: " + mFloat);
		System.out.println("Char: " + mChar);
		System.out.println("Byte: " + mByte);
		System.out.println("Boolean: " + mBoolean);

	}
}
