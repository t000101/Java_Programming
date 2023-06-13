package leetcode;

public class Example {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(x%10);
        int y = 0;

        y = y*10 + (x%10);
        System.out.println(y);
        x = x/10;
        System.out.println(x);
    }
}
