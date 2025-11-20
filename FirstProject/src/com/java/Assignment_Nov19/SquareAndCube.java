package com.java.Assignment_Nov19;

import java.util.Scanner;

public class SquareAndCube {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("Fixed Square Value: " + sumOfSquare(number));
		System.out.println("Fixed Cube Value: " + sumOfCube(number));
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number to perform Square :");
			int userSquareValue = +scan.nextInt();
			System.out.println("Enter number to perform Cube :");
			int userCubeValue = +scan.nextInt();
			System.out.println("User Input Square Value : " + sumOfSquare(userSquareValue));
			System.out.println("User Input Cube Value : " + sumOfCube(userCubeValue));
		}

	}

	private static int sumOfCube(int number) {
		return number * number * number;

	}

	private static int sumOfSquare(int number) {
		return number * number;
	}

}
