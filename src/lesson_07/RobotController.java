package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat","07/06/2022");
        RobotCat solarRobotCat = new SolaraRobotCat("solarRobotCat","07/06/2022");
        RobotCat windRobotCat = new WindRobotCat("windRobotCat","07/06/2022");

        robotController.charge(Arrays.asList(batteryRobotCat, solarRobotCat));

    }

    //Controller | IS-A relationship
    public void charge(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
