package Modules.Locators;

import Modules.Authorize.ElementInspector;
import Report.RemoteReporter;
import io.appium.java_client.MobileElement;

public class LoginScreen {
    public ElementInspector inspector;
    public RemoteReporter reporter;
    MobileElement element;

    public LoginScreen(ElementInspector inspector, RemoteReporter reporter) {
        this.inspector = inspector;
        this.reporter = reporter;
    }

    public MobileElement btnExistingUser() {
        try {
            element = this.inspector.findElementByName("Existing User");
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
        return element;
    }

    public MobileElement tbUserName() {
        try {
            element = this.inspector.findElementByName("Username");
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
        return element;
    }

    public MobileElement tbPassWord() {
        try {
            element = this.inspector.findElementByName("Password");
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
        return element;
    }

    public MobileElement btnLogin() {
        try {
            element = this.inspector.findElementByName("Login");
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
        return element;
    }
}
