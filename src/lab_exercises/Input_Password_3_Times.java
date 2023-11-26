package lab_exercises;

import java.util.Scanner;

public class Input_Password_3_Times {
    public static void main(String[] args) {
        String systemPassword = "password123";
        System.out.println(checkNumberOfInputPassword(systemPassword));
    }

    public static String checkNumberOfInputPassword(String systemPassword){
        int countInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String userPassword = scanner.next();

        while(countInput < 2){
            if(userPassword.equals(systemPassword)){
                return "Correct. You can access the system!";
            }
            else{
                System.out.print("Password is incorrect. Please try again: ");
                userPassword = scanner.next();
                countInput++;
            }
        }
        return "Your password is still wrong. Please contact the system admin to support!";
    }
}
