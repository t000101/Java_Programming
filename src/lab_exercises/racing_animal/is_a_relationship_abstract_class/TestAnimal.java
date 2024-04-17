package lab_exercises.racing_animal.is_a_relationship_abstract_class;
import java.security.SecureRandom;
import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal horse = new NonFlyAnimal("Horse", new SecureRandom().nextInt(100));
        System.out.println(horse.toString());

        Animal dog = new NonFlyAnimal("Dog", new SecureRandom().nextInt(50));
        System.out.println(dog.toString());

        Animal eagle = new FlyAnimal("Eagle", new SecureRandom().nextInt(100));
        System.out.println(eagle.toString());

        Animal duck = new FlyAnimal("Duck", new SecureRandom().nextInt(50));
        System.out.println(duck.toString());

        Animal lion = new NonFlyAnimal("Lion", new SecureRandom().nextInt(100));
        System.out.println(lion.toString());

        AnimalController animalController = new AnimalController();
        animalController.winnerSpeedWithoutWings(Arrays.asList(horse, dog, eagle, duck, lion));
    }
}
