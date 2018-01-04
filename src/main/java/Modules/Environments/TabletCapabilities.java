package Modules.Environments;
import Modules.Abstracts.*;

public class TabletCapabilities extends CapacibilityAbstract {
    public TabletCapabilities() {
        super();
    }

    public TabletCapabilities(String platformName, String platformVersion, String deviceName, Boolean noReset,
                              String automationName, Boolean showXcodeLog, String orientation) {
        super(platformName, platformVersion, deviceName, noReset, automationName, showXcodeLog, orientation);
    }
}
