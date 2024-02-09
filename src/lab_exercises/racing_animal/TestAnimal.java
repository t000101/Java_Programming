package lab_exercises.racing_animal;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse");
        Animal tiger = new Animal("Tiger");
        Animal dog = new Animal("Dog");

        AnimalController animalController = new AnimalController();
        animalController.getSpeedOfAnimals(Arrays.asList(horse, tiger, dog));
        animalController.winnerSpeed(Arrays.asList(horse, tiger, dog));
    }
}
