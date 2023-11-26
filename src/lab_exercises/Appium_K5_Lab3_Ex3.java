package lab_exercises;

public class Appium_K5_Lab3_Ex3 {
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        //System.out.println("Numbers from the string: ");
        System.out.printf("Numbers from the string: %s", getNumberFromAString(myStr));
    }

    public static String getNumberFromAString(String yourString){
        String numberInString = "";

        char[] charArr = yourString.toCharArray();
        for (char c : charArr) {
            if(Character.isDigit(c)) numberInString += Character.toString(c);
        }

        return  numberInString;
    }
}
