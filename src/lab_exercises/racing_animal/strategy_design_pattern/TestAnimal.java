package lab_exercises.racing_animal.strategy_design_pattern;

import java.security.SecureRandom;
import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", new SecureRandom().nextInt(100), new NonFlyable());
        System.out.println(horse.toString());

        Animal dog = new Animal("Dog", new SecureRandom().nextInt(50), new NonFlyable());
        System.out.println(dog.toString());

        Animal eagle = new Animal("Eagle", new SecureRandom().nextInt(100), new Flyable());
        System.out.println(eagle.toString());

        Animal duck = new Animal("Duck", new SecureRandom().nextInt(50), new Flyable());
        System.out.println(duck.toString());

        Animal lion = new Animal("Lion", new SecureRandom().nextInt(100), new NonFlyable());
        System.out.println(lion.toString());

        AnimalController animalController = new AnimalController();
        animalController.winnerSpeedWithoutWings(Arrays.asList(horse, dog, eagle, duck, lion));
    }
}
