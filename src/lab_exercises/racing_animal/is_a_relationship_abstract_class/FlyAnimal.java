package lab_exercises.racing_animal.is_a_relationship_abstract_class;

public class FlyAnimal extends Animal{
    public FlyAnimal(String name, int speed) {
        super(name, speed);
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
