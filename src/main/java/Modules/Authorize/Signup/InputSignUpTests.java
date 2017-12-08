package Modules.Authorize.Signup;

import Modules.Authorize.ElementInspector;
import Report.RemoteReporter;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

import java.util.Random;
import java.util.logging.Logger;

public class InputSignUpTests {

    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    public ElementInspector inspector;
    public RemoteReporter reporter;

    public InputSignUpTests(ElementInspector inspector, RemoteReporter reporter) {
        this.inspector = inspector;
        this.reporter = reporter;
    }

    private void reset() {
        try {
            MobileElement elementUsr = this.inspector.findElementByName(txtUsrPlaceholder);
            elementUsr.setValue("");
            MobileElement elementPwd = this.inspector.findElementByName(txtPwdPlaceholder);
            elementPwd.setValue("");

        } catch (Exception e) {
            System.out.print("New User Button Could Not Be Found");
        }
    }

    public void execute() {
        try {
            MobileElement newUserBtn = this.inspector.findElementByName(btnNewUsr);
            newUserBtn.click();
            Random rn = new Random();
            String usr = username + rn.nextInt(1000);
            inputWhiteSpace();
        } catch (Exception e) {
            System.out.print("New User Button Could Not Be Found");
        }
    }

    private void reset(MobileElement element, int length) {
        System.out.print(element.getAttribute("label") + element);
        for (int i = 0; i < length; i++) {
            element.sendKeys(Keys.DELETE);
        }
    }

    public void inputWhiteSpace() {
        try {
            //Detect
            MobileElement element = this.inspector.findElementByName(txtUsrPlaceholder);

            //Given
            element.setValue("   ");

            //then
            MobileElement signUpBtn = this.inspector.findElementByName(btnSignUp);
            if (signUpBtn.isEnabled() == true) {
                report("Should not enable sign up button incase input space for username");
            }

            MobileElement cancelBtn = this.inspector.findElementByName(btnSignUp);
            cancelBtn.click();
        } catch (Exception e) {
            reporter.report(txtUsrPlaceholder + "Could not be found");
        }
    }

    public void input2Characters(MobileElement element) {
        try {
            //Given
            element.setValue("ha");

            //then
            MobileElement signUpBtn = this.inspector.findElementByName(btnSignUp);
            if (signUpBtn.isEnabled() == true) {
                report("Should not enable sign up button incase input only 2 char for username");
            }
            reset(element,2);
            inputMoreThan32Characters(element);

        } catch (Exception e) {
            reporter.report(txtUsrPlaceholder + " Could not be found");
        }
    }

    public void inputMoreThan32Characters(MobileElement element) {
        try {

            //Given
            element.setValue("qwertyuiopasdfghjklzxcvbnmqwertyu");

            //then
            MobileElement signUpBtn = this.inspector.findElementByName(btnSignUp);
            if (signUpBtn.isEnabled() == true) {
                report("Should not enable sign up button incase input more than 32 char for username");
            }
            reset(element,33);
            inputSpecialCharacter(element);

        } catch (Exception e) {
            reporter.report(txtUsrPlaceholder + "Could not be found");
        }
    }

    public void inputSpecialCharacter(MobileElement element) {
        try {

            //Given
            String text = "!!!hai dep trai";
            element.setValue(text);

            //then
            MobileElement signUpBtn = this.inspector.findElementByName(btnSignUp);
            if (signUpBtn.isEnabled() == true) {
                report("Should not enable sign up button incase input more than 32 char for username");
            }
            reset(element,15);
        } catch (Exception e) {
            reporter.report(txtUsrPlaceholder + "Could not be found");
        }
    }
    private void report(String message) {
        reporter.report(message);
    }
}
