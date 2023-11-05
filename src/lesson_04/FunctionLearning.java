package lesson_04;

import java.security.SecureRandom;

//DRY: Don't repeat yourself

//S: Single Responsibility

public class FunctionLearning {
    public static void main(String[] args) {
        sayHello("Teo"); //Teo  is a "argument"
        System.out.println(getARandomNumber(1000));
        printNumber();
    }

    //name is a "parameter"
    public static void sayHello(String name){
        System.out.println(name);
    }

    public static int getARandomNumber(int boundary){
        return new SecureRandom().nextInt(boundary);
    }

    public static void printNumber(){
        for (int index = 0; index < 10; index++) {
            if(index == 8){
                System.out.println("You have reached the magic number... ");
                return;
            }
            else System.out.println("Index is: " + index);
        }

        System.out.println("End the function!");
    }
}
