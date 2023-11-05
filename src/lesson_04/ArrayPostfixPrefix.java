package lesson_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        int[] myIntArray = new int[5];

        for (int index = 0; index < 5;) {
            myIntArray[index++] = index;
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
