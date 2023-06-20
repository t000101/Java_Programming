package lab_exercises;

import java.util.Scanner;

public class Calculate_BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input your height: ");
		float height = scanner.nextFloat();
		
		System.out.print("Please input your weight: ");
		float weight = scanner.nextFloat();
		
		float bmi = calculateBMI(height, weight);
		
		if(bmi <= 18.5) {
			System.out.println("Underweight");
		}
		else if(bmi <= 24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi <= 29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obesity");
		}	
		
		
	}
	
	public static float calculateBMI(float height, float weight) {
		return weight/(height*2);
	}

}
