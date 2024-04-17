package lab_exercises.racing_animal.strategy_design_pattern;

public class Animal {

    PropertiesOfAnimal propertiesOfAnimal;
    private String name;
    private int speed;

    public Animal(PropertiesOfAnimal propertiesOfAnimal, String name, int speed) {
        this.propertiesOfAnimal = propertiesOfAnimal;
        this.name = name;
        this.speed = speed;
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
}
