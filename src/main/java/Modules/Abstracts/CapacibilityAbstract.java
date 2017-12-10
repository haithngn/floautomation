package Modules.Abstracts;

import Support.Capabilities;

public abstract class CapacibilityAbstract implements Capabilities {

    private String _platformName;
    private String _platformVersion;
    private String _deviceName;
    private Boolean _noReset;
    private String _automationName;
    private Boolean _showXcodeLog;
    private String _orientation;

    public CapacibilityAbstract() {
        this._platformName = platformName;
        this._platformVersion = platformVersion;
        this._deviceName = deviceName;
        this._noReset = noReset;
        this._automationName = automationName;
        this._showXcodeLog = showXcodeLog;
        this._orientation = orientation;
    }

    public CapacibilityAbstract(String platformName, String platformVersion, String deviceName, Boolean noReset,
                                String automationName, Boolean showXcodeLog, String orientation) {
        this._platformName = platformName;
        this._platformVersion = platformVersion;
        this._deviceName = deviceName;
        this._noReset = noReset;
        this._automationName = automationName;
        this._showXcodeLog = showXcodeLog;
        this._orientation = orientation;
    }

    public String getPlatformName() {
        return _platformName;
    }

    public String getPlatformVersion() {
        return _platformVersion;
    }

    public String getDeviceName() {
        return _deviceName;
    }

    public String getAutomationName() {
        return _automationName;
    }

    public String getOrientation() {
        return _orientation;
    }

    public Boolean getNoReset() {
        return _noReset;
    }

    public Boolean getShowXcodeLog() {
        return _showXcodeLog;
    }

    public void setPlatformName(String platformName) {
        this._platformName = platformName;
    }

    public void setPlatformVersion(String platformVersion) {
        this._platformVersion = platformVersion;
    }

    public void setDeviceName(String deviceName) {
        this._deviceName = deviceName;
    }

    public void setAutomationName(String automationName) {
        this._automationName = automationName;
    }

    public void setOrientation(String orientation) {

        this._orientation = orientation;
    }

    public void setNoReset(Boolean noReset) {
        this._noReset = noReset;
    }

    public void setShowXcodeLog(Boolean showXcodeLog) {
        this._showXcodeLog = showXcodeLog;
    }
}
