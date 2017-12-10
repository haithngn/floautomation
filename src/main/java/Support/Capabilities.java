package Support;

import org.apache.xpath.operations.Bool;

public interface Capabilities {
    /*
    * DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.1");
        caps.setCapability("deviceName", "iPad Air 11");
        caps.setCapability("noReset", false);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("showXcodeLog", true);
//        caps.setCapability("orientation", "LANDSCAPE");
//        caps.setCapability("uuid", "AC114C34-A1C9-481F-9581-1DF587504AA9");

        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        caps.setCapability("app", "/Users/neo/Library/Developer/Xcode/DerivedData/Flo-hhwvjeglcynnoudvxoslwcwadice/Build/Products/Automation-iphonesimulator/Flo.app");

        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
        */
    String platformName = "iOS";
    String platformVersion = "11.1";
    String deviceName = "iPad Air 11";
    Boolean noReset = false;
    String automationName = "XCUITest";
    Boolean showXcodeLog = true;
    String orientation = "Portrait";

    public String getPlatformName();
    public String getPlatformVersion();
    public String getDeviceName();
    public String getAutomationName();
    public String getOrientation();
    public Boolean getNoReset();
    public Boolean getShowXcodeLog();

    public void setPlatformName(String platformName);
    public void setPlatformVersion(String platformVersion);
    public void setDeviceName(String deviceName);
    public void setAutomationName(String automationName);
    public void setOrientation(String orientation);
    public void setNoReset(Boolean noReset);
    public void setShowXcodeLog(Boolean showXcodeLog);
}
