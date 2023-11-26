package lesson_06;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat kitty = new RobotCat();
        RobotCat meo = new RobotCat("Meo");
        meo.printName();
        meo.setName("Meo Meo");
        meo.printName();
    }
}
