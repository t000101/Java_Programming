package lesson_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the time(hr): ");
        int arrivalTime = scanner.nextInt();

        //Single If or Else
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("1. Going to the shop");

//        if(isHeOnTime){
//            System.out.println("Let's talk!");
//        }else{
//            System.out.println("Write a letter");
//        }

        //Ternary Operator
        String outputMsg = isHeOnTime ? "Let's talk!" : "Write a letter";
        System.out.println(outputMsg);

        System.out.println("Going home");
    }
}
