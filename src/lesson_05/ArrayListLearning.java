package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myArrList = Arrays.asList(1,2,3,4);
        List<Integer> myArrList2 = new ArrayList<>();
        myArrList2.add(1);
        myArrList2.add(2);
        myArrList2.add(3);
        myArrList2.add(4);

//        for (int index = 0; index < myArrList.size(); index++) {
//            boolean isElemetnEvenNumber = myArrList.get(index) % 2 != 0;
//            if(isElemetnEvenNumber){
//                myArrList.set(index, myArrList.get(index) + 1);
//            }
//        }

        System.out.println(myArrList);

        myArrList2.remove(1);
        myArrList2.remove(new Integer(1));

        System.out.println(myArrList2);

        //CRUD operations

        //isEmpty
        if(!myArrList.isEmpty()){
            System.out.println("List's size: " + myArrList.size());
        }

        //Check element's existence
        System.out.println(myArrList2.contains(1));
        System.out.println(myArrList.contains(5));
        System.out.println(myArrList.indexOf(5));
    }
}
