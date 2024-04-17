package lab_exercises.racing_animal.builder_design_pattern;

import java.security.SecureRandom;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class TestAnimal {
    public static void main(String[] args) {
        Animal horse = new Animal.Builder().setName("Horse").setSpeed(new SecureRandom().nextInt(100)).build();
        System.out.println(horse.toString());

        Animal dog = new Animal.Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(50)).build();
        System.out.println(dog.toString());

        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(100)).setFly(true).build();
        System.out.println(eagle.toString());

        Animal duck = new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(50)).setFly(true).build();
        System.out.println(duck.toString());

        Animal lion = new Animal.Builder().setName("Dog").setSpeed(new SecureRandom().nextInt(100)).build();
        System.out.println(lion.toString());

        AnimalController animalController = new AnimalController();
        animalController.winnerSpeedWithoutWings(Arrays.asList(horse, dog, eagle, duck, lion));
    }
}
