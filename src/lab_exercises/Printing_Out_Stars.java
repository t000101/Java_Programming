package lab_exercises;

import java.util.Scanner;

//* Given a number that user inputs from keyboard, please print the stars from maximum to 1 in order, line by line
//* Example:
//```
//input: 9
//output:
//*********
//********
//*******
//******
//*****
//****
//***
//**
//*
//```

public class Printing_Out_Stars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Given a number: ");
		int inputNumber = scanner.nextInt();
		scanner.close();
		
		firstWay(inputNumber);
		
	}
	
	public static void firstWay(int inputNumber) {
		while(inputNumber > 0) {
			for(int i = 1; i <= inputNumber; i++) {
				System.out.print("*");
			}
			System.out.println();
			inputNumber--;
		}
	}
	
	public static void secondWay(int inputNumber) {
		String star = "*";
		for(int i = inputNumber; i > 0; i--) {
			System.out.print(star.repeat(i));
			System.out.println();
		}
	}
}
