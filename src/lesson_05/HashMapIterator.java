package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Police");
        emergencyList.put(114, "Firefighter");
        emergencyList.put(115, "Ambulance");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");

        //Replace
//        for (Integer key : emergencyList.keySet()) {
//            if(emergencyList.get(key).equals("Others")){
//                emergencyList.replace(key, "Something else!");
//            }
//        }
//
//        for (Integer key : emergencyList.keySet()) {
//            System.out.println(emergencyList.get(key));
//        }

        //Remove
        for (Integer key : emergencyList.keySet()) {
            if(emergencyList.get(key).equals("Others")){
                emergencyList.remove(key, "Others");
            }
        }

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
