package lab_exercises.racing_animal.strategy_design_pattern;

public class Animal {

    PropertiesOfAnimal propertiesOfAnimal;
    private String name;
    private int speed;

    public Animal(String name, int speed, PropertiesOfAnimal propertiesOfAnimal) {
        this.name = name;
        this.speed = speed;
        this.propertiesOfAnimal = propertiesOfAnimal;
    }

    public boolean flyable() {
        return propertiesOfAnimal.fly();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return name + " {" +
                "speed= " + speed +
                ", flyAble= " + this.flyable() +
                '}';
    }
}
