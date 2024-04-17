package lesson_11_01;

public class TestDriverFactory {
    public static void main(String[] args) {
        DriverFactory.initAppiumDriver(Platform.ANDROID);
        DriverFactory.initAppiumDriver(Platform.IOS);

        System.out.println(SupportIOSVersion.IOS_13.getiOSName());
        System.out.println(SupportIOSVersion.IOS_15.getiOSName());
    }

}
