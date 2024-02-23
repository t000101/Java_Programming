package lab_exercises.racing_animal;

public class AnimalWithBuilder {
    Boolean withWings = false;

    public AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder){
        this.withWings = builder.withWings;
    }

    public static class Builder{
        Boolean withWings = false;

        public Builder withWings(Boolean hasWings){
            this.withWings = hasWings;
            return this;
        }

        public AnimalWithBuilder build(){ return new AnimalWithBuilder(this);}
    }
}
