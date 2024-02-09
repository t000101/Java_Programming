package lab_exercises.racing_animal;

import java.util.List;

public class AnimalController {

    public void getSpeedOfAnimals(List<Animal> animalList){
        for (Animal animal : animalList) {
            System.out.printf("%s has the speed: %d\n", animal.getName(), animal.getSpeed());
        }
    }

    public void winnerSpeed(List<Animal> animalList){
        int maxSpeed = 0;
        String winnerName = "No Animal";
        for (Animal animal : animalList) {
            if(animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                winnerName = animal.getName();
            }
        }

        if(maxSpeed > 0) System.out.printf("Winner is %s, with speed: %d\n", winnerName, maxSpeed);
    }

}
