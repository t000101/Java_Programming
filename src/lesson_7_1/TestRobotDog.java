package lesson_7_1;

public class TestRobotDog {
    public static void main(String[] args) {
        RobotDog dog = new SolarRobotDog();
        RobotDog.changeId();
        RobotDog dog2 = new WindRobotDog();

        System.out.println(dog.getDogId());
        System.out.println(dog2.getDogId());

    }
}
