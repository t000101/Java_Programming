package lesson_12;

import lesson_11_01.Platform;
public class DriverFactory {
    public static AppiumDriver getAppiumDriver(String platform){
        AppiumDriver appiumDriver;
        switch (platform) {
            case "IOS":
                appiumDriver = new IOSDriver();
                break;
            case "ANDROID":
                appiumDriver = new AndroidDriver();
                break;
            default:
                throw new IllegalArgumentException("Please provide correct platform.");
        }

        return appiumDriver;
    }
}
