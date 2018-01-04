package Modules.Keywords;

import Modules.Authorize.ElementInspector;
import Report.RemoteReporter;
import io.appium.java_client.MobileElement;
import Modules.Locators.*;

public class LoginKeywords {
    public ElementInspector inspector;
    public RemoteReporter reporter;
    public LoginScreen loginScreen;

    public LoginKeywords(ElementInspector inspector, RemoteReporter reporter) {
        this.inspector = inspector;
        this.reporter = reporter;
        this.loginScreen = new LoginScreen(inspector, reporter);
    }

    public void login(String userName, String passWord) {
        try {
            reporter.report("Started Sign in keyword");
            loginScreen.btnExistingUser().click();

            loginScreen.tbUserName().clear();
            loginScreen.tbUserName().setValue(userName);
            loginScreen.tbPassWord().clear();
            loginScreen.tbPassWord().setValue(passWord);

            loginScreen.btnLogin().click();
            reporter.report("Ended Sign in keyword");
        } catch (Exception e) {
            reporter.report(e.getLocalizedMessage());
        }
    }
}
