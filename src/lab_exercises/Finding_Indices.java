package lab_exercises;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//## Finding indices 
//* Given an array
//* Allow user to input a target number
//* Output: print out all pair of element indexes those are sum up to the target number
//* Example:
//```
//int [] myIntArr = {1,2,3,4,5,6};
//int inputNum = 7;
//output:
//(0, 5)
//(1, 4)
//(2, 3)
//* If we have no pair, you can return -1 or just print `we don't have any pair`

public class Finding_Indices {

	public static void main(String[] args) {
		int [] myIntArr = {1,2,3,4,5,6};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Give me a target number: ");
		int targetNum = scanner.nextInt();
		scanner.close();
		
		secondWay(myIntArr, targetNum);
	}
	
	public static void firstWay(int[] arrNumber, int targetNumber) {
		for(int i = 0; i < arrNumber.length - 1; i++) {
			int firstNum = arrNumber[i];
			int subtractedNumber = targetNumber - firstNum;
			for(int j = i; j < arrNumber.length; j++) {
				if(arrNumber[j] == subtractedNumber) {
					System.out.printf("(%d, %d)", firstNum, subtractedNumber);
					System.out.println();
				}
			}
		}
	}
	
	public static void secondWay(int[] arrNumber, int targetNumber) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrNumber.length; i++) {
			int subtractedNumber = targetNumber - arrNumber[i];
			if(map.containsKey(subtractedNumber)) {
				System.out.printf("(%d, %d)", map.get(subtractedNumber), i);
				System.out.println();
			}
			map.put(arrNumber[i], i);
		}
	}
	
	

}
