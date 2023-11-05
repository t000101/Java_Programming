package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(3);

        /*
         * Get 3 smallest value in the myArrList
         *
         * */

        //First way
        List<Integer> withoutDuplicatedValueList = new ArrayList<>();
        for (Integer number : myArrList) {
            if(!withoutDuplicatedValueList.contains(number)){
                withoutDuplicatedValueList.add(number);
            }
        }
        Collections.sort(withoutDuplicatedValueList);
        System.out.println(withoutDuplicatedValueList);

        //Second way
        Set<Integer> set = new HashSet<>(myArrList);
        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);

        //Sublist
        List<Integer> first3minValues = withoutDuplicatedValueList.subList(0, 3); //3 will be exclusive
        System.out.println(first3minValues);

    }
}
