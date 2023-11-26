package lesson_7_1;

public class RobotDog {
    protected static int dogId = 0;
    private String name;
    private int robotId;

    public RobotDog() {
        robotId = dogId + 1;
        dogId++;
    }

    public int getDogId() {
        return robotId;
    }

    public static void changeId(){
        dogId++;
    }
}
