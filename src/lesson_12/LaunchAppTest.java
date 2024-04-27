package lesson_12;

import lesson_11_01.Platform;

public class LaunchAppTest {
    public static void main(String[] args) {
        AppiumDriver appiumDriver = null;
        try{
            appiumDriver = DriverFactory.getAppiumDriver("nodata");
            appiumDriver.initDriver();
            //Continue the logic here
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(appiumDriver != null){
                appiumDriver.closeDriver();
            }
        }
    }
}
