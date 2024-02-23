package lab_exercises.a_simple_menu;

import javax.sound.midi.spi.SoundbankReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSimpleMenu {
    public static void main(String[] args) {
        ArrayList<A_Simple_Menu> menuList = new ArrayList<>();
        SimpleMenuController simpleMenuController = new SimpleMenuController();
        simpleMenuController.setDefaultMenuList(menuList);

        boolean isContinue = false;

        do{
            simpleMenuController.printMenuList(menuList);
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select the item in the menu above: ");
            int indexMenu = sc.nextInt();

            if(indexMenu < 6 && indexMenu > 0){
                switch (indexMenu) {
                    case 1:
                        simpleMenuController.addNumberIntoArrayList();
                        break;
                    case 2:
                        simpleMenuController.printNumbers();
                        break;
                    case 3:
                        System.out.println("The Maximum number is: " + simpleMenuController.getMaximumNumber());
                        break;
                    case 4:
                        System.out.println("The Minium number is: " + simpleMenuController.getMinimumNumber());
                        break;
                    case 5:
                        System.out.println("Please enter your number to find in the array list: ");
                        System.out.println("Your index of number that you want to find: " + simpleMenuController.findNumber(sc.nextFloat()));
                        break;
                }

            }

            System.out.println("Do you want to continue? Say True/False: ");
            isContinue = sc.nextBoolean();
        }
        while (isContinue);


    }
}
