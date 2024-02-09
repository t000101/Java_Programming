package lab_exercises.racing_animal;

import java.security.SecureRandom;

public class Animal {
    String name;
    int speed = 0;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        this.speed = new SecureRandom().nextInt(50);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed(){
        return speed;
    }
}
