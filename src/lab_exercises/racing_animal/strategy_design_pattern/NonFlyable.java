package lab_exercises.racing_animal.strategy_design_pattern;

public class NonFlyable implements PropertiesOfAnimal{
    @Override
    public boolean fly() {
        return false;
    }
}
