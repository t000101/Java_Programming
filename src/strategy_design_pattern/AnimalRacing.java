package strategy_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    Animal getWinner(List<Animal> animalList){
        List<Animal> nonFlyableAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.flyable()){
                nonFlyableAnimals.add(animal);
            }
        }

        //Get the winner
        for(Animal animal : nonFlyableAnimals){

        }

        return null;
    }
}
