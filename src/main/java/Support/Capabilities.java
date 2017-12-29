package Support;

import org.apache.xpath.operations.Bool;

public interface Capabilities {

    String platformName = "iOS";
    String platformVersion = "11.2";
    String deviceName = "iPad Air";
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
