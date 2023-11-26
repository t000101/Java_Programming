package lesson_05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String myName1 = "Mavis"; //Literal declaration
        String myName2 = "Mavis"; //Literal declaration
        String myName3 = new String("Mavis"); //Via String object

        System.out.println("myName1 == myName2: " + (myName1 == myName2));
        System.out.println("myName1 == myName3: " + (myName1 == myName3));

        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        int totalDigit = 0;
        int totalUpperCase =  0;
        int totalLowerCase = 0;

        //Check lower case, upper case, digit...
        String myPassword = "myPassword";
        char[] myCharacter = myPassword.toCharArray();
        for (char character : myCharacter) {
            if(Character.isDigit(character)) totalDigit++;
            else if(Character.isUpperCase(character)) totalUpperCase++;
            else if(Character.isLowerCase(character)) totalLowerCase++;
        }

        if(totalDigit > 0 && totalUpperCase > 0 && totalLowerCase > 0){
            System.out.println("Password is set!");
        }else{
            System.out.println("Password is invalid!");
        }

        // Replacement | Immutable
        String badWordContainer = "    bad, very bad, sth else, bad ";
        badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        String filterString = badWordContainer.replace("bad", "b**");
        System.out.println(filterString);

        //Trim
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        //Subtring, indexOf
        String url = "https://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https"));

        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2));

        //Split
        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));
        String[] splitStr1 = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        //Regex | Regular Expression
        String myCookingTimes = "    105 mins   ";

        //TODO: Pattern and Matcher

        String cookingTimeNumStr = myCookingTimes.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

        int cookingTime = Integer.valueOf(cookingTimeNumStr);

        System.out.println("Cooking Time is: " + cookingTime + 1);

        // Concatenation
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        //TODO: StringBuiler (It's used when building a large data

    }
}
