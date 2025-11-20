package com.java.Assignment_Nov19;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		int firstValue = 10;
		int secondValue = 20;
		System.out.println("Fixed Input Sum Values = " + sumOfTwoValues(firstValue, secondValue));

		try (// User Input
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter First Value:");
			int firstUserNumber = scan.nextInt();
			System.out.println("Enter Second Value:");
			int secondUserNumber = scan.nextInt();
			System.out.println("User Input Sum Values = " + sumOfTwoValues(firstUserNumber, secondUserNumber));
		}

	}

	private static int sumOfTwoValues(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

}
