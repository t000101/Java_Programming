package lab_exercises.racing_animal;

import lesson_08.HouseWithBuilder;
import lesson_08.HouseWithBuilder.Builder;

public class TestAnimalWithBuilder {
    public static void main(String[] args) {
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder().withWings(false).build();
        AnimalWithBuilder falcon = new AnimalWithBuilder.Builder().withWings(false).build();
    }
}
