package lab_exercises.a_simple_menu;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMenuController {
    ArrayList<Float> numberArrayList = new ArrayList<>();

    public void setDefaultMenuList(ArrayList<A_Simple_Menu> menuList){
        menuList.add(new A_Simple_Menu("Add number into ArrayList"));
        menuList.add(new A_Simple_Menu("Print numbers"));
        menuList.add(new A_Simple_Menu("Get maximum number"));
        menuList.add(new A_Simple_Menu("Get minimum number"));
        menuList.add(new A_Simple_Menu("Find number"));
    }

    public void printMenuList(ArrayList<A_Simple_Menu> menuList){
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println("Menu " + (i+1) + " :" + menuList.get(i));
        }
    }

    public void addNumberIntoArrayList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add the total numbers you want to add to ArrayList: ");
        int totalNumbers = sc.nextInt();

        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Please enter the number " + (i+1) + ": ");
            numberArrayList.add(sc.nextFloat());
        }

        System.out.println("Your number list is: ");
        printNumbers();
    }

    public void printNumbers(){
        for (int i = 0; i < numberArrayList.size(); i++) {
            int noNumber = i + 1;
            System.out.println("Number " + noNumber + ": " + numberArrayList.get(i));
        }
    }

    public Float getMaximumNumber(){
        Float maxNumber = 0f;
        for (Float number : numberArrayList) {
            if(number > maxNumber){
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public Float getMinimumNumber(){
        Float minNumber = 0f;
        for (Float number : numberArrayList) {
            if(number < minNumber){
                minNumber = number;
            }
        }
        return minNumber;
    }

    public int findNumber(Float number){
        return numberArrayList.indexOf(number) + 1;
    }
}
