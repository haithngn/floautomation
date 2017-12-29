package Support;
import Modules.Authorize.ElementInspector;
import JsonFiles.ReadJSONserver;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class NewSetupSever extends ReadJSONserver{
    public static IOSDriver driver;
    public String service = "https://hooks.slack.com/services/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"; //https://hooks.slack.com/services/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";
    public String channel = "#automation";
    public String sender = "Automation";
    public RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);

    public  void SetUp() throws MalformedURLException {

        ReadJsonDevice("iPadAir");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName",platformName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("deviceName",deviceName);
        caps.setCapability("automationName", automationName);
        caps.setCapability("noReset", noReset);
        caps.setCapability("app",app);
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
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
