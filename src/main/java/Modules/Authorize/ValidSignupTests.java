package Modules.Authorize;

import Report.RemoteReporter;
import io.appium.java_client.MobileElement;

import java.util.Random;

public class ValidSignupTests {
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    public ElementInspector inspector;
    public RemoteReporter reporter;

    public ValidSignupTests(ElementInspector inspector, RemoteReporter reporter) {
        this.inspector = inspector;
        this.reporter = reporter;
    }

    public void execute() {
        try {
            MobileElement newUserBtn = this.inspector.findElementByName(btnNewUsr);
            newUserBtn.click();
            inputUsername();
        } catch (Exception e) {
            System.out.print("New User Button Could Not Be Found");
        }
    }

    public void inputUsername() {
        try {
            MobileElement element = this.inspector.findElementByName(txtUsrPlaceholder);
            Random rn = new Random();
            String usr = username + rn.nextInt(1000);
            element.setValue(usr);
            inputPassword(password);
        } catch (Exception e) {
            System.out.print("Username textfield Could Not Be Found");
        }
    }

    public void inputPassword(String pwd) {
        try {
            MobileElement element = this.inspector.findElementByName(txtPwdPlaceholder);
            element.setValue(pwd);
            signup();
        } catch (Exception e) {
            System.out.print("Pwd textfield Could Not Be Found");
        }
    }

    public void signup() {
        try {
            MobileElement element = this.inspector.findElementByName(btnSignUp);
            element.click();
        } catch (Exception e) {
            System.out.print("Pwd textfield Could Not Be Found");
        }
    }
}
