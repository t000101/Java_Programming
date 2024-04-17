package lab_exercises.racing_animal.is_a_relationship_normal_class;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {

    public void winnerSpeedWithoutWings(List<Animal> animalList){
        Map<Integer,String> mapWinnerList = new HashMap<>();
        for (Animal animal : animalList) {
            if(!animal.isFlyAble()){
                mapWinnerList.put(animal.getSpeed(), animal.getName());
            }
        }

        int maxSpeed = Collections.max(mapWinnerList.keySet());

        for (Map.Entry<Integer, String> entry : mapWinnerList.entrySet()) {
            if(entry.getKey() == maxSpeed){
                System.out.printf("===> Winner is %s, with speed: %d\n", entry.getValue(), entry.getKey());
            }
        }
    }
}
