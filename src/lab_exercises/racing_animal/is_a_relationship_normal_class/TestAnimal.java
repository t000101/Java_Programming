package lab_exercises.racing_animal.is_a_relationship_normal_class;

import java.security.SecureRandom;
import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", new SecureRandom().nextInt(100), false);
        System.out.println(horse.toString());

        Animal dog = new Animal("Dog", new SecureRandom().nextInt(50), false);
        System.out.println(dog.toString());

        Animal eagle = new Animal("Eagle", new SecureRandom().nextInt(100), true);
        System.out.println(eagle.toString());

        Animal duck = new Animal("Duck", new SecureRandom().nextInt(50), true);
        System.out.println(duck.toString());

        Animal lion = new Animal("Lion", new SecureRandom().nextInt(100), false);
        System.out.println(lion.toString());

        AnimalController animalController = new AnimalController();
        animalController.winnerSpeedWithoutWings(Arrays.asList(horse, dog, eagle, duck, lion));
    }
}
