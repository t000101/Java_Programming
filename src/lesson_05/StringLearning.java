package lesson_05;

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
        String badWordContainer = "bad, very bad, sth else, bad ";
        badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        String filterString = badWordContainer.replace("bad", "b**");
        System.out.println(filterString);
    }
}
