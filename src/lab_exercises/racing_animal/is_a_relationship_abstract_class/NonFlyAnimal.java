package lab_exercises.racing_animal.is_a_relationship_abstract_class;

public class NonFlyAnimal extends Animal{

    public NonFlyAnimal(String name, int speed) {
        super(name, speed);
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
