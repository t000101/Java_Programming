package lab_exercises.racing_animal;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    Boolean withWings = false;
    String name;

    int speed = 0;


    public AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder){
        this.withWings = builder.withWings;
        this.name = builder.name;
        this.speed = builder.speed;
    }

    protected int getSpeed() {
        return this.speed;
    }

    protected String getName() {
        return this.name;
    }

    public static class Builder{
        Boolean withWings = false;
        String name;

        int speed = new SecureRandom().nextInt(50);

        public Builder withWings(Boolean hasWings){
            this.withWings = hasWings;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public AnimalWithBuilder build(){ return new AnimalWithBuilder(this);}
    }
}
