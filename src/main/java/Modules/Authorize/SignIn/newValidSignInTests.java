package Modules.Authorize.SignIn;

import Modules.Authorize.ElementInspector;
import Report.RemoteReporter;
import Support.NewSetupSever;
import io.appium.java_client.MobileElement;

public class newValidSignInTests extends NewSetupSever{
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    public ElementInspector inspector;
    public RemoteReporter reporter;

    public newValidSignInTests() {
        this.inspector = inspector;
        this.reporter = reporter;
    }

//    public newValidSignInTests(ElementInspector inspector, RemoteReporter reporter) {
//        this.inspector = inspector;
//        this.reporter = reporter;
//    }

    public void execute() {
        try {
            MobileElement signBtn = (MobileElement) driver.findElementByName("Existing User");
//            MobileElement signBtn = this.inspector.findElementByName("Existing User");
            signBtn.click();
            inputUsr("sender30");
        } catch (Exception e) {
            //reporter.report(e.getLocalizedMessage());
        }
    }
    private void inputUsr(String username) {
        try {
            MobileElement element = (MobileElement) driver.findElementByName("Username");
//            MobileElement element = this.inspector.findElementByName("Username");
            element.setValue(username);
            inputPwd("111111");
        } catch (Exception e) {
            //reporter.report(e.getLocalizedMessage());
        }
    }

    private void inputPwd(String password) {
        try {
            MobileElement element = (MobileElement) driver.findElementByName("Password");
//            MobileElement element = this.inspector.findElementByName("Password");
            element.setValue(password);
            signIn();
        } catch (Exception e) {
            //reporter.report(e.getLocalizedMessage());
        }
    }

    private void signIn() {
        try {
            MobileElement element = (MobileElement) driver.findElementByName("Login");
//            MobileElement element = this.inspector.findElementByName("Login");
            element.click();
        } catch (Exception e) {
            //reporter.report(e.getLocalizedMessage());
        }
    }
}
