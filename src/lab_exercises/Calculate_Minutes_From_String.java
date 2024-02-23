package lab_exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculate_Minutes_From_String {
    public static void main(String[] args) {
        String myHoursString = "2hrs and 5 minutes";
//        System.out.print("My way => ");
//        System.out.println("The " + myHoursString + " is: " + calculateMinutesFromAString(myHoursString) + ".");

        System.out.print("GPT way => ");
        System.out.println("The " + myHoursString + " is: " + calculateMinutesFromAString_WayOFGPT(myHoursString) + ".");
    }

    public static float calculateMinutesFromAString(String timeString){
        float minutes = 0F;
        char[] myArrChar = timeString.toCharArray();
        for (int index = 0; index < myArrChar.length; index++) {
            if(Character.isDigit(myArrChar[index])){
                String timeType = Character.toString(myArrChar[index + 1]) + Character.toString(myArrChar[index + 2]) + Character.toString(myArrChar[index + 3]);
                if(timeType.equals("hrs")){
                    minutes += (float) (myArrChar[index] - '0')*60;
                }
                else{
                    minutes += (float) (myArrChar[index] - '0');
                }
            }
        }
        return minutes;
    }

    public static float calculateMinutesFromAString_WayOFGPT(String input){
        Pattern pattern = Pattern.compile("(\\d+)\\s*hrs|\\s*(\\d+)\\s*minutes");
        Matcher matcher = pattern.matcher(input);

        int totalMinutes = 0;

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                int hours = Integer.parseInt(matcher.group(1));
                totalMinutes += hours * 60;
            }
            if (matcher.group(2) != null) {
                int minutes = Integer.parseInt(matcher.group(2));
                totalMinutes += minutes;
            }
        }

        return totalMinutes;
    }
}

