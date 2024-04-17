package lab_exercises.racing_animal;

import lesson_08.HouseWithBuilder;
import lesson_08.HouseWithBuilder.Builder;

import java.util.Arrays;
import java.util.List;

public class TestAnimalWithBuilder {

    public static void winnerSpeed(List<AnimalWithBuilder> animalList){
        int maxSpeed = 0;
        String winnerName = "No Animal";
        for (AnimalWithBuilder animal : animalList) {
            if(animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                winnerName = animal.getName();
            }
        }

        if(maxSpeed > 0) System.out.printf("Winner is %s, with speed: %d\n", winnerName, maxSpeed);
        else{
            System.out.println("No winner!");
        }
    }

    public static void main(String[] args) {
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder().withWings(false).setName("tiger").build();
        AnimalWithBuilder dog = new AnimalWithBuilder.Builder().withWings(false).setName("dog").build();
        AnimalWithBuilder falcon = new AnimalWithBuilder.Builder().withWings(true).setName("falcon").build();

        winnerSpeed(Arrays.asList(tiger, dog, falcon));
    }
}
