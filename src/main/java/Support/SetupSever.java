package Support;
import Modules.Authorize.ElementInspector;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class SetupSever implements ElementInspector {

    public static IOSDriver driver;
    public String service ="https://hooks.slack.com/services/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";
    public String channel = "#automation";
    public String sender = "Automation";
    public RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);

    public static void SetUp(Capabilities capabilities) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", capabilities.getPlatformName());
        caps.setCapability("platformVersion", capabilities.getPlatformVersion());
        caps.setCapability("deviceName", capabilities.getDeviceName());
        caps.setCapability("noReset", capabilities.getNoReset());
        caps.setCapability("automationName", capabilities.getAutomationName());
        caps.setCapability("showXcodeLog", capabilities.getShowXcodeLog());
        // caps.setCapability("orientation", "LANDSCAPE");
        // caps.setCapability("uuid", "AC114C34-A1C9-481F-9581-1DF587504AA9");

        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        caps.setCapability("app", "/Users/neo/Library/Developer/Xcode/DerivedData/Flo-hhwvjeglcynnoudvxoslwcwadice/Build/Products/Automation-iphonesimulator/Flo.app");

        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, caps);
    }

    public MobileElement findElementByName(String name) throws Exception {
        try {
            MobileElement element = (MobileElement) driver.findElementByAccessibilityId(name);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with name : " + name);
            throw e;
        }
    }

    public MobileElement findElementByXPath(String xpath) throws Exception {
        try {
            MobileElement element = (MobileElement) driver.findElementByXPath(xpath);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with xpath : " + xpath);
            throw e;
        }
    }
}
