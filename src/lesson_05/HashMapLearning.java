package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Police");
        emergencyList.put(114, "Firefighter");
        emergencyList.put(115, "Ambulance");
        emergencyList.put(116, "Others");
        emergencyList.put(119, "Others");

        System.out.println(emergencyList.get(113));
        emergencyList.put(116, "Something else!");

        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
        System.out.println("Has 117 key: " + emergencyList.containsKey(117));
        System.out.println("Has the 'Police' value: " + emergencyList.containsValue("Police"));
        System.out.println("Has the 'Others' value: " + emergencyList.containsValue("Others"));

        //Update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116));
        emergencyList.replace(117, "117");
        System.out.println(emergencyList.get(117));

        emergencyList.replace(115, "Ambulance", "Others!");
        System.out.println(emergencyList.get(115));

        //Remove

    }
}
