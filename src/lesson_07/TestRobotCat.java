package lesson_07;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat","07/06/2022");
        RobotCat solarRobotCat = new SolaraRobotCat("solarRobotCat","07/06/2022");

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
        batteryRobotCat.doSoth();
    }
}
