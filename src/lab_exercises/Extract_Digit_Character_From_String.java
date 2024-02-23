package lab_exercises;

import java.util.Scanner;

public class Extract_Digit_Character_From_String {
    public static void main(String[] args) {
        System.out.println("Please enter your string: ");
        Scanner sc = new Scanner(System.in);

        String yourTime = sc.next();
        System.out.println("Your string has only following digit characters: " + extractDigitCharactersFromString_wayofGPT(yourTime));
    }

    public static String extractDigitCharactersFromString(String text){
        char[] textArrChar = text.toCharArray();
        String newText = "";

        for (char character : textArrChar) {
            if(Character.isDigit(character)){
                newText += Character.toString(character);
            }
        }
        return  newText;
    }

    public static String extractDigitCharactersFromString_wayofGPT(String text){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isDigit(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }



}
