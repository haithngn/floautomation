package Support;
import Modules.Authorize.ElementInspector;
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

    public MobileElement findElementByName(String name) throws Exception {
        try {
            MobileElement element = (MobileElement) driver.findElementByAccessibilityId(name);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with name : " + name);
            throw e;
        }
    }

    public static void SetUp()throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.2");
        caps.setCapability("deviceName", "iPad Air");
        caps.setCapability("noReset", true);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("bundleId", "com.floware.universalflo.dev");
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        caps.setCapability("app",
                dir + "/automation/Flo.app");

        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, caps);
    }
}
