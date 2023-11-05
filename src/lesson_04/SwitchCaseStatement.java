package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();

        switch(userInput){
            case 1:
                System.out.println("First Prize!");
                break;
            case 2:
                System.out.println("Second Prize!");
                break;
            case 3:
                System.out.println("Third Prize!");
                break;
            default:
                System.out.println("Goodbye!");
        }

        switch(userInput){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays!");
                break;
            case 6:
            case 7:
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Invalid Date!");
        }

    }
}
