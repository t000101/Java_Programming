package lesson_11_01;

public class DriverFactory {
    public static void initAppiumDriver(Platform platform){
        switch (platform) {
            case IOS:
                System.out.println("Init IOS driver");
                break;
            case ANDROID:
                System.out.println("Init Android driver");
                break;
            default:
                throw new IllegalArgumentException("Please provide correct platform.");
        }
    }
}
