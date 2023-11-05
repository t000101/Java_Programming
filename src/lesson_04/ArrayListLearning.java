package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList myArrayList = new ArrayList();
        myArrayList.add(0);
        myArrayList.add(false);
        myArrayList.add("string");
        myArrayList.add(1.8f);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(0);
        //intArrayList.add(false);
        //intArrayList.add("string");
        //intArrayList.add(1.8f);

        List<Integer> intArrayList3 = Arrays.asList(1,2,3,4,5);

        List<Integer> intArrayList2 = new ArrayList<Integer>();
        intArrayList2.add(1);
        intArrayList2.add(2);
        intArrayList2.add(0,3);
        for (int i = 0; i < intArrayList2.size(); i++) {
            System.out.println(intArrayList2.get(i));
        }
        for (int integer : intArrayList2) {
            System.out.println(integer);
        }
    }   


}
