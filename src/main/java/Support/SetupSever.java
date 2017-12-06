package Support;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class SetupSever {
    public static IOSDriver driver;
    public static void SetUp()throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.1");
        caps.setCapability("deviceName", "iPad Air");
        caps.setCapability("noReset", true  );
        caps.setCapability("automationName", "XCUITest");
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        caps.setCapability("app",
                dir + "/automation/Flo.app");

        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new IOSDriver(remoteUrl, caps);
    }
}
