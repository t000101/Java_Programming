package lab_exercises.racing_animal.is_a_relationship_normal_class;

public class Animal{
    private String name;
    private int speed;
    private boolean flyAble;

    public Animal() {
    }

    public Animal(String name, int speed, boolean flyAble) {
        this.name = name;
        this.speed = speed;
        this.flyAble = flyAble;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    @Override
    public String toString() {
        return name + " {" +
                "speed= " + speed +
                ", flyAble= " + flyAble +
                '}';
    }
}
