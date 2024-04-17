package lesson_11_01;

public enum SupportIOSVersion {
    IOS_13("iOS 13", 13),
    IOS_15("iOS 15", 15);

    private String iOSName;
    private int version;

    SupportIOSVersion(String iOSName, int version){
        this.iOSName = iOSName;
        this.version = version;
    }

    public String getiOSName() {
        return iOSName;
    }

    public int getVersion() {
        return version;
    }
}
