package lab_exercises.racing_animal.is_a_relationship_abstract_class;

public abstract class Animal {
    private String name;
    private int speed;

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract boolean canFly();

    @Override
    public String toString() {
        return name + " {" +
                "speed= " + speed +
                '}';
    }
}
