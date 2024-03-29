package lesson_07;

//Sub-class, child class, concrete class
public class BatteryRobotCat extends RobotCat{

    public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    @Override
    public String charge(){
        return super.charge() + "with battery";
    }

    @Override
    public void doSoth() {
        System.out.println("Hi!");
    }
}
