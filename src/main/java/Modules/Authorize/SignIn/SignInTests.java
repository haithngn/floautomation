package Modules.Authorize.SignIn;

import Modules.Authorize.ValidSignupTests;
import Report.RemoteReporter;
import Report.RemoteReporterImpl;
import Support.SetupSever;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTests extends SetupSever {
    public static String btnNewUsr = "New User";
    public static String txtUsrPlaceholder = "Please use between 3 and 32 characters";
    public static String txtPwdPlaceholder = "Passwords must have between 6 and 32 characters";
    public static String username = "automation" + "_haidepchai_";
    public static String password = "111111";
    public static String btnSignUp = "Sign Up";

    @BeforeMethod
    public void setUp() throws IOException {
        super.SetUp();
    }

    @Test
    public void signin() {
        RemoteReporter reporter = new RemoteReporterImpl(this.service, this.channel,this.sender);
        ValidSignInTests tests = new ValidSignInTests(this, reporter);
        tests.execute();
    }
}
