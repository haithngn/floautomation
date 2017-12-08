package Modules.Authorize;
import Support.SetupSever;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class SignUpTests extends SetupSever implements ElementInspector {
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    public MobileElement findElementByName(String name) throws Exception {
        try {
            MobileElement element = (MobileElement) driver.findElementByAccessibilityId(name);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with name : " + name);
            throw e;
        }
    }

    @BeforeMethod
    public void setUp() throws IOException {
        SetupSever.SetUp();
    }

    @Test
    public void navigateToSignUp() {
        InputSignUpTests tests = new InputSignUpTests(this);
        tests.execute();
//        SignUpSucceedTests tests = new SignUpSucceedTests(this);
//        tests.navigateToSignUp();
//        try {
//            MobileElement newUserBtn = this.findElementByName(btnNewUsr);
//            newUserBtn.click();
//            Random rn = new Random();
//            String usr = username + rn.nextInt(1000);
//            inputUsername(usr);
//        } catch (Exception e) {
//            System.out.print("New User Button Could Not Be Found");
//        }
    }

    public void inputUsername(String name) {
        try {
            MobileElement element = this.findElementByName(txtUsrPlaceholder);
            element.setValue(name);
            inputPassword(password);
        } catch (Exception e) {
            System.out.print("Username textfield Could Not Be Found");
        }
    }

    public void inputPassword(String pwd) {
        try {
            MobileElement element = this.findElementByName(txtPwdPlaceholder);
            element.setValue(pwd);
            signup();
        } catch (Exception e) {
            System.out.print("Pwd textfield Could Not Be Found");
        }
    }

    public void signup() {
        try {
            MobileElement element = this.findElementByName(btnSignUp);
            element.click();
        } catch (Exception e) {
            System.out.print("Pwd textfield Could Not Be Found");
        }
    }
}
