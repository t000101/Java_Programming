package lab_exercises.racing_animal.builder_design_pattern;

public class Animal {
    private String name;
    private int speed;
    private boolean isFly;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFly() {
        return isFly;
    }

    public static class Builder {
        private String name = null;
        private int speed = 0;
        private boolean isFly = false;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFly(boolean fly) {
            isFly = fly;
            return this;
        }

        public Animal build(){
            Animal animal = new Animal();
            animal.name = this.name;
            animal.speed = this.speed;
            animal.isFly = this.isFly;
            return animal;
        }
    }

    @Override
    public String toString() {
        return name + " {" +
                "speed= " + speed +
                ", flyAble= " + isFly +
                '}';
    }

}
