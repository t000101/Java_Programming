package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if(firstMethod() && secondMethod()){
            System.out.println("The first if!");
        }
        if(firstMethod() & secondMethod()){
            System.out.println("The second if!");
        }
        if(secondMethod() & firstMethod()){
            System.out.println("The third if!");
        }
    }

    public static boolean firstMethod(){
        System.out.println("firstMethod");
        return false;
    }

    public static boolean secondMethod(){
        System.out.println("secondMethod");
        return true;
    }
}
