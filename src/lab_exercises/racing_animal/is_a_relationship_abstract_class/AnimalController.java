package lab_exercises.racing_animal.is_a_relationship_abstract_class;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {

    public void winnerSpeedWithoutWings(List<Animal> animalList){
        Map<Integer, String> mapAnimal = new HashMap<>();
        for (Animal animal : animalList) {
            if(!animal.canFly()){
                mapAnimal.put(animal.getSpeed(), animal.getName());
            }
        }

        int maxSpeed = Collections.max(mapAnimal.keySet());

        for (Map.Entry<Integer, String> entry : mapAnimal.entrySet()) {
            if(entry.getKey() == maxSpeed){
                System.out.printf("Winner is %s, with the speed is %d", entry.getValue(), entry.getKey());
            }
        }

    }
}
