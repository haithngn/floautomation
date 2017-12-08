package Modules.Authorize;

import io.appium.java_client.MobileElement;

import java.util.Random;

public class InputSignUpTests {

    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    public ElementInspector inspector;

    public InputSignUpTests(ElementInspector inspector) {
        this.inspector = inspector;
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

    public void inputWhiteSpace() {
        System.out.print("inputWhiteSpace");
    }
}
