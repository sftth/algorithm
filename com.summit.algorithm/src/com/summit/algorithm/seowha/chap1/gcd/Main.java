package com.summit.algorithm.seowha.chap1.gcd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//TO-DO 1.drawing UI
		//int numberA = 250;
		//int numberB = 30;
		
		Scanner reader = new Scanner(System.in);
		Gcd gcd = new Gcd();
		
		while(true) {
			System.out.println("\n\nEUCLID1: Gret GCD of two positive integer\n"
					+ "Input 0 to end program");
			System.out.println("Input one positive integer.");
			int numberA = reader.nextInt();
			System.out.println("Input one positive integer.");
			int numberB = reader.nextInt();

			System.out.printf("GCD of %d and %d is %d.\n",numberA, numberB, gcd.getGcd(numberA, numberB));
			
			if(numberA < 0 || numberB < 0) {
				continue;
			}
			if(numberA == 0 || numberB == 0) {
				break;
			}
		}	
	}
}
