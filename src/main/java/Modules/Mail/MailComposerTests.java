package Modules.Mail;

import Modules.Authorize.SignIn.ValidSignInTests;
import Modules.Environments.TabletCapabilities;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import Support.Capabilities;
import Support.SetupSever;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class MailComposerTests extends SetupSever {
    @BeforeMethod
    public void setUp() throws IOException {
        TabletCapabilities capabilities = new TabletCapabilities();
        super.SetUp(capabilities);
    }

    @Test
    public void signin() {
        ValidSignInTests tests = new ValidSignInTests(this, this.reporter);
        tests.execute();
        openComposer();
    }

    private void openComposer() {
        try {
            MobileElement emailsBtn = this.findElementByName("Emails");
            emailsBtn.click();
            emailsBtn.click();
            expandRecipients();
        } catch (Exception e) {

        }
    }

    private void expandRecipients() {
        try {
            String  xpath = "//XCUIElementTypeApplication[@name=\"Flo Automation\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton";
            MobileElement emailsBtn = this.findElementByXPath(xpath);
            emailsBtn.click();
            inputToRecipient();
        } catch (Exception e) {
            reporter.report("Cannot find expand button (above To label)");
        }
    }

    private void inputToRecipient() {
        try {
            String xpath = "//XCUIElementTypeApplication[@name=\"Flo Automation\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
            MobileElement element = this.findElementByXPath(xpath);
            element.setValue("ios@123flo.com");
            element.sendKeys(Keys.ENTER);

            inputCCRecipient();

        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void inputCCRecipient() {
        try {
            String xPath = "//XCUIElementTypeApplication[@name=\"Flo Automation\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
            MobileElement element = this.findElementByXPath(xPath);
            element.setValue("froala@123flo.com");
            element.sendKeys(Keys.ENTER);
            inputBccRecipient();
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void inputBccRecipient() {
        try {
            String xPath = "//XCUIElementTypeApplication[@name=\"Flo Automation\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeTextField";
            MobileElement element = this.findElementByXPath(xPath);
            element.setValue("sender@123flo.com");
            element.sendKeys(Keys.ENTER);

            inputSubject();

        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void inputSubject() {
        try {
            String xPath = "//XCUIElementTypeApplication[@name=\"Flo Automation\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeTextField";
            MobileElement element = this.findElementByXPath(xPath);
            element.setValue("Hello, Welcome to Flo Automation System");
            element.sendKeys(Keys.ENTER);

            inputContent();

        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void inputContent() {
        try {
            String name = "Type something";
            MobileElement element = this.findElementByName(name);
            element.setValue("Hello, Hai Dep Trai");

            send();

        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void send() {
        try {
            String xPath = "//XCUIElementTypeNavigationBar[@name=\"New Message\"]/XCUIElementTypeButton[3]";
            MobileElement element = this.findElementByXPath(xPath);
            element.click();

            createEvent();
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }

    private void createEvent() {
        try {
            MobileElement emailsBtn = this.findElementByName("Events");
            emailsBtn.click();
            emailsBtn.click();
            inputSummary();
        } catch (Exception e) {

        }
    }

    private void inputSummary() {

    }


}
