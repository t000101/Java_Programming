package lesson_06;

public class Calculator {

    //Method signature

    //Method overloading
    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3){
        return num1 + num2 + num3 ;
    }

    //Varargs | Rest Parameter
    public int sum(int num1, int num2, int... restNumbers){
        int arrTotal = 0;
        for (int restNumber : restNumbers) {
            arrTotal += restNumber;
        }
        return num1 + num2 + arrTotal ;
    }


    //WHEN overloading happens | Compile Time
    //WHEN overriding happens | Run Time
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
