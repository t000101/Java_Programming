package lesson_12;

public class Calculator {

    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(new Calculator().divide(4, 2));
            System.out.println(new Calculator().divide(4, 0));
        } catch(ArithmeticException e){
            throw new IllegalArgumentException("[ERR] Second number can't be zero!");
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("See you again.");
        }

    }
}
